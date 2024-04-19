import java.util.Arrays;
class LinearQueue {
    int[] queue;
    int front;
    int rear;
    int capacity;

    public LinearQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            front = rear = 0;
            queue[rear] = item;
        } else {
            rear++;
            queue[rear] = item;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return item;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue contents:");
            System.out.println(Arrays.toString(Arrays.copyOfRange(queue, front, rear + 1)));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinearQueue linearQueue = new LinearQueue(5);
        linearQueue.enqueue(10);
        linearQueue.enqueue(20);
        linearQueue.enqueue(30);
        System.out.println("Dequeued: " + linearQueue.dequeue());
        linearQueue.printQueue();
    }
}
