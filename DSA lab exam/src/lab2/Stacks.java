package lab2;

public class Stacks {
        private int[] num;
        private int top;
        private int size;

        public Stacks(int capacity) {
            top = -1;
            size=0;
            num = new int[capacity];
        }

        public boolean isEmpty() {
            return size== 0;
        }

        public boolean isFull() {
            return size == num.length ;
        }

        public int peek() {
            if (!isEmpty())
                return num[top];
            else
                return -1;
        }

        public int pop() {
            if (!isEmpty())
            {
                int value=num[top--];
                size--;
                return value;}
            else
                return -1;
        }
        public void printStack() {
            for (int i = 0; i <= top; i++) {
                System.out.println(num[i]);
            }}
        public void push(int value) {
            if (!isFull()) {
                num[++top] = value;
                size++;
            } else {
                System.out.println("Stack is full");
            }
        }}
