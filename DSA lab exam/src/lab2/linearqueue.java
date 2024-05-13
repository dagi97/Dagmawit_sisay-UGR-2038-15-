package lab2;

class QueueUsingStacks {
    private Stack stack1;
    private Stack stack2;

    public QueueUsingStacks(int capacity) {
        stack1 = new Stack(capacity);
        stack2 = new Stack(capacity);
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }
}

public class linearqueue {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(10);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}