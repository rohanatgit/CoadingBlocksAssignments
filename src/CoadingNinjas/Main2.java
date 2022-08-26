package CoadingNinjas;

import java.util.*;
public class Main2 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //String s=sc.next();
        while(n>0){
            int rem=n%10;
            System.out.print(rem+"+");
            n--;
            if(n==1){
                System.out.println(rem-1);
                break;
            }

        }

    }
}