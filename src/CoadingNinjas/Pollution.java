package CoadingNinjas;

import java.util.Scanner;

public class Pollution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int ev=0;
            int os=0;
            while(n>0){
                int rem=n%10;
                if(rem%2==0){
                    ev+=rem;
                }
                else{
                     os+=rem;
                }
                n=n/10;
            }
            if(os%3==0){
                System.out.println("Yes");
            }
            else{
                if(ev%4==0){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }

    }
}
