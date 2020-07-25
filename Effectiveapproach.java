
import java.util.*;
public class Effectiveapproach{
    public static void main(String args[]){
        int countf=0;
        int countb=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        
        int m=sc.nextInt();  
        for(int i=0;i<m;i++){
            int ele=sc.nextInt();
            int j=0;
            while(j<n)
            {
                if(a[j]==ele){
                    countf++;
                    j++;
                    break;}
                    else{
                        countf++;
                        j++;
                    }
            }
            j=n-1;
            while(j>=0)
            {
                if(a[j]==ele){
                    countb++;
                    j--;
                    break;}
                    else{
                        countb++;
                        j--;
                    }
            }
        }
        //System.out.println(countb);
        System.out.println(countf+" "+countb);
        sc.close();
    }
}