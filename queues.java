import java.util.Stack;
class LinearQueueUsingStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public LinearQueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enQueue(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int deQueue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        return stack1.pop();
    }

    public void printQueue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue contents as array:");
            System.out.print("[");
            for (int i = 0; i < stack1.size(); i++) {
                System.out.print(stack1.get(i));
                if (i < stack1.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        LinearQueueUsingStack queue = new LinearQueueUsingStack();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println("Dequeued: " + queue.deQueue());
        queue.printQueue();
    }
}
