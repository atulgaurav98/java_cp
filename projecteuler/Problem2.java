package projecteuler;
//import java.util.*;

public class Problem2{
    public static int  fibo(int n)
{
    if(n==0)
        return 1;
    if(n==1)
        return 2;
    return fibo(n-1)+fibo(n-2);
}
    public static void main(String args[]){
        
        int n=100;
        int s=0;
        int i=0;
        while(i<n&&s<=4000000){
            if(fibo(i)%2==0)
                s+=fibo(i);
                i++;
        }
        System.out.println(s);
       
    }
}