package lab2;

public class Stack {
    int[] nums;
    int top;
    int size;
    public Stack(int capacity) {
        nums = new int[capacity];
        top = -1;
        size = 0;
    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(nums[i]);
        }}
    void push(int value) {
        if (!isFull()) {
            nums[++top] = value;
            size++;
        }
        else {
            System.out.println("Full");
        }
    }
    public int pop() {
        if (!isEmpty()) {
            int value = nums[top--];
            size--;
            return value;
        }
        return -1;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == nums.length;
    }
    public int peek() {
        if(top >= 0) {
            return nums[top];
        }
        return -1;

    }
    public static void main(String[] args) {
        Stack numStack = new Stack(2);
        numStack.push(12);
        numStack.push(20);
        numStack.push(60);
        numStack.printStack();
        System.out.println(numStack.peek());
        numStack.pop();
        System.out.println();
        numStack.printStack();



        }
    }


