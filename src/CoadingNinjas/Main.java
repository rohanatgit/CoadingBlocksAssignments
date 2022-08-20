package CoadingNinjas;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            arr2[j]=sc.nextInt();
        }
        int p=0;
        for(int k=0;k<arr1.length;k++){
            ans[p]=arr2[k];
            p++;
        }
        for(int l=0;l<arr2.length;l++){
            ans[p]=arr2[l];
            p++;
        }
        Arrays.sort(ans);
        int start=0;
        int end=ans.length-1;

            int mid=start+(end-start)/2;

        System.out.print(ans[mid]-1);



    }
}

