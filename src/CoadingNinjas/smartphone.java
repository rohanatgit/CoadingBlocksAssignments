package CoadingNinjas;

import java.util.Scanner;

public class smartphone {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T= sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n<m){
                System.out.println("Harshit");
            }else if(n>m){
                System.out.println("Aayush");
            }
        }
    }
}
