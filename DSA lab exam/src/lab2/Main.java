package lab2;

public class Main{

        public static void main(String[] args) {
            Stacks stacks1= new Stacks(2);
             stacks1.push(3);
            stacks1.push(2);
            stacks1.push(1);


            System.out.println(stacks1.peek()+"x");
            stacks1.pop();
            System.out.println(stacks1.isFull());
            System.out.println(stacks1.isEmpty());
            stacks1.printStack();}

        }

