


class Link {

    public char dData;
    public Link next;

    public Link(char dd) {
        dData = dd;
    }

    public void displayLink() // display ourself
    {
        System.out.print(dData + " ");
    }
}

////////////////////////////////////////////////////////////////
class MyStack {

    Link head;

    public MyStack() {
        this.head = null;
    }

    //The method initializes the stack

    //The method inserts the item at top of Stack
    void push(char dd){

        Link insertedLink = new Link(dd);

        if (head == null){
            head = insertedLink;
            return;
        }
        insertedLink.next = head ;
        head = insertedLink;
       
    }

    //The method shows the item at top of Stack
    char peek(){
        //if it is empty stack
        if(isEmpty()){
            System.out.println("ERROR, it is empty stack");
            return 0;
          }
          return head.dData;
    }

    //The method removes the item at top of Stack
    char pop(){
        Link deleted;

        //if it is empty stack
        if(isEmpty()){
         System.out.println("ERROR, it is empty stack");
         return 0;
        }
        //if it has single element
        if(head.next == null){
         deleted = head;
         head = null;
         return deleted.dData;
        }
 
        //front will be front.next
        deleted  =head;
        head = head.next;
        return deleted.dData;        
    }

    //Returns true if the stack is empty / otherwise returns false
    boolean isEmpty(){
        return (head == null);
    }

}
////////////////////////////////////////////////////////////////

public class Test {

    public static void checkValidity(String command) {
        MyStack paranthesis = new MyStack();
        //char headd = paranthesis.head.dData;

        for (int i = 0; i< command.length(); i++){
            char cc = command.charAt(i);
            switch (cc) {
                case '(':
                    paranthesis.push(cc);
                    break;
                case '{':
                    paranthesis.push(cc);
                    break;
                case '[':
                    paranthesis.push(cc);
                    break;
                case ')':
                    if (!paranthesis.isEmpty() && paranthesis.peek() == '(') {
                        paranthesis.pop();
                    } else if (paranthesis.isEmpty()) {
                        System.out.println(") is missing");
                        return;
                    }
                    else{ //if it is not empty and peak is not equal to (
                        System.out.println("Paranthesis are not matching");
                        return;
                    }
                    break;
                case '}':
                    if (!paranthesis.isEmpty() && paranthesis.peek() == '{') {
                        paranthesis.pop();
                    } else if (paranthesis.isEmpty()) {
                        System.out.println("} is missing");
                        return;
                    }
                    else { //if it is not empty and peak is not equal to {
                        System.out.println("Paranthesis are not matching");
                        return;
                    } 
                    break;
                case ']':
                    if (!paranthesis.isEmpty() && paranthesis.peek() == '[') {
                        paranthesis.pop();
                    } else if(paranthesis.isEmpty()){
                        System.out.println("] is missing");
                        return;   
                    }
                    else { //if it is not empty and peak is not equal to [
                        System.out.println("Paranthesis are not matching");
                        return; 
                    }
                    break;
                default:
                    // Handle other characters if necessary
                    break;
            }

        }


        if(paranthesis.isEmpty()){
            System.out.println("ACCEPTED");
        } else{
            System.out.println(paranthesis.peek()+ " did not closed.");
        }
    }

    public static void main(String[] args) {

        String com1 = "System.out.println((3+5) + 2);";
        String com2 = "int x = (3+5) * 2);";
        String com3 = "calculateSum(((a+2) * 2), (3*b);";
        
        String com4 = "int res = (arr[0]+arr[1]) * arr[2];";
        String com5 = "int res = (arr[0]+arr[1)] * arr[2];";
        String com6 = "int res = (arr[0]+arr[1]) * arr[2]];";
        
        String com7 = "public static void main(String[] args) {"
                + "int res = (arr[0]+arr[1]) * arr[2];"
                + "}}";
        String com8 = "public static void main(String[] args) {"
                + "int[] arr = {1,2,3,4};";
        String com9 = "public static void main(String[] args) {"
                + "int[] arr = {1,2,3,4};"
                + "}";
        String com10 = "{{}[(){()()[]}],([],[{}])}";
        
        
        System.out.println("----------------------------------------------");
        System.out.println(com1);
        checkValidity(com1);
        System.out.println("----------------------------------------------");
        System.out.println(com2);
        checkValidity(com2);
        System.out.println("----------------------------------------------");
        System.out.println(com3);
        checkValidity(com3);
        System.out.println("----------------------------------------------");
        System.out.println(com4);
        checkValidity(com4);
        System.out.println("----------------------------------------------");
        System.out.println(com5);
        checkValidity(com5);
        System.out.println("----------------------------------------------");
        System.out.println(com6);
        checkValidity(com6);
        System.out.println("----------------------------------------------");
        System.out.println(com7);
        checkValidity(com7);
        System.out.println("----------------------------------------------");
        System.out.println(com8);
        checkValidity(com8);
        System.out.println("----------------------------------------------");
        System.out.println(com9);
        checkValidity(com9);
        System.out.println("----------------------------------------------");
        System.out.println(com10);
        checkValidity(com10);
        System.out.println("----------------------------------------------");
        
        

    }  // end main()
}  // end class LinkStackApp
////////////////////////////////////////////////////////////////
