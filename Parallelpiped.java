import java.util.*;
public class Parallelpiped{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A1=sc.nextInt();
        int A2=sc.nextInt();
        int A3=sc.nextInt();
        int k=(A3*A1)/A2;
        int l=(A1*A2)/A3;
        int m=(A2*A3)/A1;
        int a=(int)Math.sqrt(k);
        int b=(int)Math.sqrt(l);
        int c=(int)Math.sqrt(m);
        int res=4*a+4*b+4*c;
        System.out.println(res);
        sc.close();
        
        
    }
}