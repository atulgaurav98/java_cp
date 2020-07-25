//import java.io.*;
import java.util.*;
//import java.lang.*;
public class series{
    public static void main(String args[]){
        int k;
        int res=0;
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int j=1;j<=q;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            res=a+b;
            System.out.print(res+" ");
            for(int i=1;i<n;i++){
                k=((int)Math.pow(2, i));
                int l=k*b;
                res+=l;
                System.out.print(res+" ");
            }
        }
        sc.close();
    }
}