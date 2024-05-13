import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("how many elements are available in your sequence");
        int array[]=new int[scanner.nextInt()];
        System.out.println("enter the value of the elements");
        for(int i=0;i< array.length;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("enter the element you want to find");
        int target= scanner.nextInt();
        int sum=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==target){
                sum+=1;
            }
        }
        if(sum==0)
            System.out.println("element not found");
        else
            System.out.println(target+ " is found "+ sum +" number of times");

    }
}




