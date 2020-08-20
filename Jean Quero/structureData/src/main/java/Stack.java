public class Stack {

    private String [] stack;

    private int top;
    private int length;


    public Stack(int length) {
        stack = new String[length];
        this.length = length;
        top = -1;
    }

    public void push(String value) {
        if (length > top) {
            stack[++top] = value;
        } else {
            System.out.println("The stack is full");
        }

    }

    public void pop() {
        if (top >= 0) {
            stack[top--] = null;
        } else {
            System.out.print("The stack is empty");
        }
    }

    public void display() {
        for (int i = stack.length -1; i >= 0; i --) {
            if (stack[i] != null)
              System.out.print("1-"+stack[i]+"--\n");
        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.push("10");
        stack.push("12");
        stack.push("6");
        stack.display();
        System.out.print("-------\n");
        stack.pop();
        stack.display();
        System.out.print("-------\n");
        stack.push("3");
        stack.display();
        System.out.print("-------\n");
    }
}
