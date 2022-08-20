package CoadingNinjas;

import java.util.Scanner;

public class Pttern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int space=n-1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j+" ");
                j++;
            }
            int k=1;
            while(k<=space){
                System.out.print(" ");
                k++;
            }

            i++;
            space--;
            System.out.println();
        }
    }
}
