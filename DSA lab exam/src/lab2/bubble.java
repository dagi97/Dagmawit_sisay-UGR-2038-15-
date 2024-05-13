package lab2;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        char alpha[]={'a','b','d','y','j'};
        char temp;
        for(int i=0;i< alpha.length;i++)
            for(int j=0;j<i;j++){
                if(alpha[j]>alpha[j+1]){
                temp=alpha[j];
                alpha[j]=alpha[j+1];
                alpha[j+1]= temp;

            }

    }System.out.println(Arrays.toString(alpha));

}}
