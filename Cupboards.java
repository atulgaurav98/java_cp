//import java.io.*;
import java.util.*;
public class Cupboards{
    static int t;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int countl1=0;
        int countl0=0;
        int countr1=0;
        int countr0=0;
        int n=sc.nextInt();
        int l[]=new int[n];
        int r[]=new int[n];
        for(int i=0;i<n;i++)
        {
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(l[i]==0)
                countl0++;
            else
                countl1++;
        }
        for(int i=0;i<n;i++)
        {
            if(r[i]==0)
                countr0++;
            else
                countr1++;
        }

        if(countl0<countl1)
            Cupboards.t+=countl0;
        else
            Cupboards.t+=countl1;
       
        if(countr0<countr1)
            Cupboards.t+=countr0;
        else
            Cupboards.t+=countr1;

            System.out.println(Cupboards.t);
    sc.close();
    }

}