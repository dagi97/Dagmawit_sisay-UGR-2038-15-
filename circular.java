class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueue(int size) {
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
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        queue[rear] = item;
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
            front = (front + 1) % capacity;
        }
        return item;
    }public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue contents :");
            System.out.print("[");
            for (int i = front; i != rear; i = (i + 1) % capacity) {
                System.out.print(queue[i] + ", ");
            }
            System.out.println(queue[rear] + "]");
        }
    }
}
public class circular {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(12);
        circularQueue.enqueue(20);
        circularQueue.enqueue(31);
        System.out.println("Dequeued: " + circularQueue.dequeue());
        circularQueue.printQueue();
    }
}

