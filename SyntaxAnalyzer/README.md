# CENG206: Programming Languages - Syntax Analyzer

## Project Overview
This project implements a **tokenized syntax analyzer** for a subset of Java-like code. The analyzer validates source code against predefined grammar rules and reports syntax errors such as missing semicolons, invalid identifiers, unmatched braces, and unsupported operators. It consists of two phases:
1. **Lexical Analysis**: Tokenizes input characters into keywords, identifiers, literals, operators, and separators.
2. **Syntax Analysis**: Validates token sequences against grammar rules using recursive descent parsing.

## Grammar Rules Supported
- **Variable Declaration**: `type identifier;` (`type` = `int` or `char`, `identifier` = single lowercase letter).
- **Assignment Statement**: `identifier = expression;`
- **If Statement**: `if (condition) { statements }`
- **While Loop**: `while (condition) { statements }`
- **Return Statement**: `return expression;`

## How to Build and Run
### Prerequisites
- Java 21 (Amazon Corretto recommended).
- Input file (e.g., `input.txt`) containing Java-like code.

### Compilation
1. Compile all Java files into the `bin` directory:
   ```bash
   javac -d bin src/*.java
   ```

### Execution
Run the analyzer with the following command:
```bash
/usr/bin/env /usr/lib/jvm/java-21-amazon-corretto/bin/java \
  -XX:+ShowCodeDetailsInExceptionMessages \
  -cp bin SyntaxAnalyzer input.txt output.txt
```

#### Command Breakdown
- `-XX:+ShowCodeDetailsInExceptionMessages`: Enables detailed error messages in exceptions.
- `-cp bin`: Specifies the classpath (compiled classes in the `bin` directory).
- `input.txt`: Input file containing Java-like code.
- `output.txt`: Output file for syntax analysis results.

## Error Handling
The analyzer detects:
- Missing semicolons (`;`).
- Invalid identifiers (non-lowercase letters or multi-character).
- Unmatched braces (`{`, `}`).
- Unsupported operators in expressions or conditions.

## Example
### Input (`input.txt`)
```java
int x;
x = 5 + 3;
if (x > 2) {
    x = x - 1;
}
while (x != 0) {
    x = x - 1;
}
return x;
```

### Output (`output.txt`)
```
Statement 1: Valid Variable Declaration
Statement 2: Valid Assignment Statement
Statement 3: Valid If Statement
Statement 4: Valid While Loop
Statement 5: Valid Return Statement
```


## Notes
- The code uses **pure Java** (no external libraries).
- Adjust the Java path in the command if using a different JDK (e.g., OpenJDK).


