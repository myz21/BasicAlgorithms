import java.io.*;
import java.util.*;

/*
 23050151035
 Muhammed Yıldız
 */
/*
 I wrote that on terminal:
 /usr/bin/env /usr/lib/jvm/java-21-amazon-corretto/bin/java -XX:+S
howCodeDetailsInExceptionMessages -cp bin SyntaxAnalyzer input.txt output.txt
 */
 enum TokenType {
    KEYWORD, IDENTIFIER, LITERAL, OPERATOR, SEPARATOR, EOF
}

class Token {
    TokenType type;
    String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return type + "(" + value + ")";
    }
}

class SyntaxErrorException extends Exception {
    public SyntaxErrorException(String message) {
        super(message);
    }
}

class Tokenizer {
    private int index = 0;
    private char[] input;

    public Tokenizer(String input) {
        this.input = input.toCharArray();
    }

    public List<Token> tokenize() throws SyntaxErrorException {
        List<Token> tokens = new ArrayList<>();
        while (index < input.length) {
            char c = input[index];
            if (Character.isWhitespace(c)) {
                index++;
                continue;
            } else if (Character.isLetter(c)) {
                String word = readWord();
                if (isKeyword(word)) {
                    tokens.add(new Token(TokenType.KEYWORD, word));
                } else {
                    if (word.length() != 1 || !Character.isLowerCase(word.charAt(0))) {
                        throw new SyntaxErrorException("Invalid identifier: " + word);
                    }
                    tokens.add(new Token(TokenType.IDENTIFIER, word));
                }
            } else if (Character.isDigit(c)) {
                String number = readNumber();
                tokens.add(new Token(TokenType.LITERAL, number));
            } else if (isSeparator(c)) {
                tokens.add(new Token(TokenType.SEPARATOR, String.valueOf(c)));
                index++;
            } else if (isOperatorStart(c)) {
                String op = readOperator();
                tokens.add(new Token(TokenType.OPERATOR, op));
            } else {
                throw new SyntaxErrorException("Unexpected character: " + c);
            }
        }
        tokens.add(new Token(TokenType.EOF, ""));
        return tokens;
    }

    private String readWord() {
        StringBuilder sb = new StringBuilder();
        while (index < input.length && Character.isLetterOrDigit(input[index])) {
            sb.append(input[index++]);
        }
        return sb.toString();
    }

    private String readNumber() {
        StringBuilder sb = new StringBuilder();
        while (index < input.length && Character.isDigit(input[index])) {
            sb.append(input[index++]);
        }
        return sb.toString();
    }

    private String readOperator() {
        char first = input[index++];
        if (index < input.length) {
            char next = input[index];
            String potentialOp = String.valueOf(first) + next;
            if (potentialOp.equals("==") || potentialOp.equals("!=") || potentialOp.equals("<=") || potentialOp.equals(">=")) {
                index++;
                return potentialOp;
            }
        }
        return String.valueOf(first);
    }

    private boolean isKeyword(String word) {
        return word.equals("int") || word.equals("char") || word.equals("if") || word.equals("while") || word.equals("return");
    }

    private boolean isSeparator(char c) {
        return c == ';' || c == '{' || c == '}' || c == '(' || c == ')';
    }

    private boolean isOperatorStart(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '=' || c == '<' || c == '>' || c == '!';
    }
}

class Parser {
    private List<Token> tokens;
    private int current = 0;
    private int statementNumber = 1;
    private List<String> output = new ArrayList<>();
    private Stack<Integer> braceStack = new Stack<>();

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    public List<String> parse() {
        while (current < tokens.size()) {
            Token token = peek();
            if (token.type == TokenType.EOF) break;
            try {
                parseTopLevelStatement();
                statementNumber++;
            } catch (SyntaxErrorException e) {
                output.add("Statement " + statementNumber + ": " + e.getMessage());
                synchronize();
                statementNumber++;
            }
        }
        if (!braceStack.isEmpty()) {
            output.add("Error: Unmatched braces");
        }
        return output;
    }

    private void parseTopLevelStatement() throws SyntaxErrorException {
        Token token = peek();
        if (token.type == TokenType.KEYWORD) {
            switch (token.value) {
                case "int":
                case "char":
                    parseVariableDeclaration();
                    break;
                case "if":
                    parseIfStatement();
                    break;
                case "while":
                    parseWhileLoop();
                    break;
                case "return":
                    parseReturnStatement();
                    break;
                default:
                    throw new SyntaxErrorException("Unexpected keyword: " + token.value);
            }
        } else if (token.type == TokenType.IDENTIFIER) {
            parseAssignment();
        } else {
            throw new SyntaxErrorException("Unexpected token: " + token.value);
        }
    }

    private void parseStatement() throws SyntaxErrorException {
        Token token = peek();
        if (token.type == TokenType.KEYWORD) {
            switch (token.value) {
                case "int":
                case "char":
                    parseVariableDeclaration();
                    break;
                case "if":
                    parseIfStatement();
                    break;
                case "while":
                    parseWhileLoop();
                    break;
                case "return":
                    parseReturnStatement();
                    break;
                default:
                    throw new SyntaxErrorException("Unexpected keyword: " + token.value);
            }
        } else if (token.type == TokenType.IDENTIFIER) {
            parseAssignment();
        } else if (token.type == TokenType.SEPARATOR && token.value.equals("{")) {
            consume(TokenType.SEPARATOR, "{");
            braceStack.push(1);
            parseBlock();
            consume(TokenType.SEPARATOR, "}");
            braceStack.pop();
        } else {
            throw new SyntaxErrorException("Unexpected token: " + token.value);
        }
    }

    private void parseVariableDeclaration() throws SyntaxErrorException {
        consume(TokenType.KEYWORD);
        consume(TokenType.IDENTIFIER);
        consume(TokenType.SEPARATOR, ";");
        output.add("Statement " + statementNumber + ": Valid Variable Declaration");
    }

    private void parseAssignment() throws SyntaxErrorException {
        consume(TokenType.IDENTIFIER);
        consume(TokenType.OPERATOR, "=");
        parseExpression();
        consume(TokenType.SEPARATOR, ";");
        output.add("Statement " + statementNumber + ": Valid Assignment Statement");
    }

    private void parseIfStatement() throws SyntaxErrorException {
        consume(TokenType.KEYWORD, "if");
        consume(TokenType.SEPARATOR, "(");
        parseCondition();
        consume(TokenType.SEPARATOR, ")");
        consume(TokenType.SEPARATOR, "{");
        braceStack.push(1);
        parseBlock();
        consume(TokenType.SEPARATOR, "}");
        braceStack.pop();
        output.add("Statement " + statementNumber + ": Valid If Statement");
    }

    private void parseWhileLoop() throws SyntaxErrorException {
        consume(TokenType.KEYWORD, "while");
        consume(TokenType.SEPARATOR, "(");
        parseCondition();
        consume(TokenType.SEPARATOR, ")");
        consume(TokenType.SEPARATOR, "{");
        braceStack.push(1);
        parseBlock();
        consume(TokenType.SEPARATOR, "}");
        braceStack.pop();
        output.add("Statement " + statementNumber + ": Valid While Loop");
    }

    private void parseReturnStatement() throws SyntaxErrorException {
        consume(TokenType.KEYWORD, "return");
        parseExpression();
        consume(TokenType.SEPARATOR, ";");
        output.add("Statement " + statementNumber + ": Valid Return Statement");
    }

    private void parseBlock() throws SyntaxErrorException {
        int braceLevel = 1;
        while (braceLevel > 0 && current < tokens.size()) {
            Token token = consumeAny();
            if (token.value.equals("{")) {
                braceLevel++;
            } else if (token.value.equals("}")) {
                braceLevel--;
                if (braceLevel == 0) {
                    current--;
                    break;
                }
            } else {
                current--;
                parseStatement();
            }
        }
        if (braceLevel != 0) {
            throw new SyntaxErrorException("Unmatched braces");
        }
    }

    private void parseCondition() throws SyntaxErrorException {
        parseExpression();
        Token op = consume(TokenType.OPERATOR);
        if (!isRelationalOperator(op.value)) {
            throw new SyntaxErrorException("Invalid relational operator: " + op.value);
        }
        parseExpression();
    }

    private void parseExpression() throws SyntaxErrorException {
        parseTerm();
        while (isAdditiveOperator(peek())) {
            consume(TokenType.OPERATOR);
            parseTerm();
        }
    }

    private void parseTerm() throws SyntaxErrorException {
        parseFactor();
        while (isMultiplicativeOperator(peek())) {
            consume(TokenType.OPERATOR);
            parseFactor();
        }
    }

    private void parseFactor() throws SyntaxErrorException {
        Token token = consumeAny();
        if (token.type != TokenType.LITERAL && token.type != TokenType.IDENTIFIER) {
            throw new SyntaxErrorException("Invalid factor: " + token.value);
        }
    }

    private Token consume(TokenType type) throws SyntaxErrorException {
        if (current >= tokens.size()) {
            throw new SyntaxErrorException("Unexpected end of input");
        }
        Token token = tokens.get(current);
        if (token.type != type) {
            throw new SyntaxErrorException("Expected " + type + " but found " + token.type);
        }
        current++;
        return token;
    }

    private Token consume(TokenType type, String value) throws SyntaxErrorException {
        Token token = consume(type);
        if (!token.value.equals(value)) {
            throw new SyntaxErrorException("Expected " + value + " but found " + token.value);
        }
        return token;
    }

    private Token consumeAny() throws SyntaxErrorException {
        if (current >= tokens.size()) {
            throw new SyntaxErrorException("Unexpected end of input");
        }
        return tokens.get(current++);
    }

    private Token peek() {
        if (current >= tokens.size()) {
            return new Token(TokenType.EOF, "");
        }
        return tokens.get(current);
    }

    private boolean isRelationalOperator(String op) {
        return op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("==") || op.equals("!=");
    }

    private boolean isAdditiveOperator(Token token) {
        return token.type == TokenType.OPERATOR && (token.value.equals("+") || token.value.equals("-"));
    }

    private boolean isMultiplicativeOperator(Token token) {
        return token.type == TokenType.OPERATOR && (token.value.equals("*") || token.value.equals("/"));
    }

    private void synchronize() {
        while (current < tokens.size()) {
            Token token = tokens.get(current);
            if (token.type == TokenType.SEPARATOR && token.value.equals(";")) {
                current++;
                break;
            } else if (token.type == TokenType.KEYWORD || token.type == TokenType.IDENTIFIER) {
                break;
            }
            current++;
        }
    }
}

public class SyntaxAnalyzer {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java SyntaxAnalyzer <input.txt> <output.txt>");
            System.exit(1);
        }

        try {
            String input = readFile(args[0]);
            Tokenizer tokenizer = new Tokenizer(input);
            List<Token> tokens = tokenizer.tokenize();

            Parser parser = new Parser(tokens);
            List<String> output = parser.parse();

            writeFile(args[1], output);
        } catch (SyntaxErrorException e) {
            try {
                writeFile(args[1], Collections.singletonList(e.getMessage()));
            } catch (IOException ioe) {
                System.err.println("Error writing output: " + ioe.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static String readFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }

    private static void writeFile(String filename, List<String> lines) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
    }
}