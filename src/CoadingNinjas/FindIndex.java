package CoadingNinjas;

import java.util.Scanner;

public class FindIndex {
    public static int findIndex(int arr[],int n,int target){

        for(int i=0;i<n;i++){
            if(arr[i]==target){
               return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Array size");
        int n=sc.nextInt();
        System.out.println("give target");
        int target=sc.nextInt();
        System.out.println("give the element in array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findIndex(arr,n,target));

    }
}
