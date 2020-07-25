import java.util.*;
public class SoftDrinking{
    public static void main(String args[]){
        int res=0,min=0,totalmm=0,totalslices=0,totalsalt=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        totalmm=((k*l)/nl);
        totalslices=c*d;
        totalsalt=(p/np);
        //System.out.println(totalmm+" "+totalslices+" "+totalsalt);
         min=totalmm; 
         if(totalslices<min)
            min=totalslices;
        if(totalsalt<min)
            min=totalsalt;
          //  System.out.println(min);
        res=(min/n);
        System.out.println(res);
        sc.close();
    }
}