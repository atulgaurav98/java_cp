
import java.util.*;
public class Supercentral{
    public static void main(String args[]){
        int rn,ln,dn,un,count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){   //loop for x,y
            rn=0;ln=0;un=0;dn=0;
            for(int j=0;j<n;j++){ 
                  //loop for x',y'
                if(y[j]==y[i])
                    {
                        if(x[j]>x[i])
                            rn++;
                        if(x[j]<x[i])
                            ln++;
                    }
                if(x[j]==x[i])
                    {
                        if(y[j]>y[i])
                            un++;
                        if(y[j]<y[i])
                            dn++;
                    }
            }
            if(rn>=1&&ln>=1&&un>=1&&dn>=1)
                count++;
        }
        System.out.println(count);
        sc.close();

    }
}