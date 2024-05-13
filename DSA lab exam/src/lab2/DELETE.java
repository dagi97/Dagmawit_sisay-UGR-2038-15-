package lab2;

import java.util.Arrays;

public class DELETE {
    public static void main(String[] args) {
        int array[]={3, 7, 1, 9, 4};
        int larray[]=new int[array.length-1];
        deletetheelement(array,3);

    }
    public static String deletetheelement(int array[],int k){
        int larray[]=new int[array.length-1];
        if(k>=0&&k< array.length) {
            if (k != 0) {
                for (int i = 0; i < k; i++) {
                    larray[i] = array[i];
                }
                for (int i = k + 1; i < array.length; i++) {
                    larray[i - 1] = array[i];
                }
                return(Arrays.toString(larray));


            }
            if (k == 0) {
                for (int i = 1; i < array.length; i++) {
                    larray[i - 1] = array[i];
                }

            }

        }
       return "Invalid index";

    }}

