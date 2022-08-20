package CoadingNinjas;

import java.util.Scanner;

public class Pollution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int s=0;
            int p=0;
            if(n%2!=0){
                s+=n;
            }
            else if(n%2==0){
                p+=n;
            }
            if(s/3==0){
                System.out.print("No\n");
            }
            else if(p/4==0){
                System.out.print("Yes");
            }
        }

    }
}
