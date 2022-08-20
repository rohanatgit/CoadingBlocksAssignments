package CoadingNinjas;

import java.util.Scanner;

public class PrintSeris {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int c=0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            int ans=(3*i+2);
            if(ans%n2!=0){
                System.out.println(ans);
                c++;
            }
            if(c==n1){
                break;
            }
        }


    }
}
