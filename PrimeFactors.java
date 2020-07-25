import java.util.*;

public class PrimeFactors{
    static boolean isPrime(long n){
        long flag=0;
        for(long i=1;i<=n;i++){
            if(n%i==0)
                flag++;
        }
        if(flag==2)
            return true;
            else
            return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //String s=sc.next();
        //BigInteger no=new BigInteger(s);

       // int n=Integer.parseInt(s);
        long max=Integer.MIN_VALUE;

        System.out.println(max);
        sc.close();
    }
}