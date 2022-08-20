import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=3;j++){
                if(i>=2 && i<=n-3){
                    if(j>=3 && j<=n-1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
