package CoadingNinjas;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=0;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;

        }
        System.out.println(sum);

    }
}
