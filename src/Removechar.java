import java.util.Scanner;
import java.util.*;
public class Removechar {
            public static void main (String args[]) {
                Scanner sc =new Scanner(System.in);
                int T=sc.nextInt();
                for(int j=0;j<T;j++){
                    System.out.println("enter 1 sentence");
                    String s1=sc.next();
                    System.out.println("enter 2 sentence");
                    String s2=sc.next();
                    //String
                    // ans="";
                    //System.out.println(removeChars(s1, s2));
                    for(int i=0;i<s2.length();i++){
                        //for(int j=0;j<s1.length();j++){

                        //}
                        s1=s1.replace(s2.charAt(i)+"","");
                    }
                    System.out.print(s1);
                }

            }
        }


