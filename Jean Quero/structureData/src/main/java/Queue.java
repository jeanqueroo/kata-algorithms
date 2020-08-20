import java.util.Arrays;

public class Queue {

    private String[] queue;
    private int length;
    private int front, last, rear = 0;

    public Queue(int length) {
        queue = new String[length];
        this.length = length;
    }

    public void insert(String value) {
        if (length > last) {
            queue[rear++] = value;
            last++;
        } else {
            System.out.print("the queue is full\n");
        }
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            if (queue[i] != null)
              System.out.print("1-"+queue[i]+"\n");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.insert("2");
        queue.insert("3");
        queue.insert("7");
        queue.insert("1");
        queue.insert("6");
        queue.display();
    }


}
