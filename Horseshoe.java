

import java.util.*;
public class Horseshoe{
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int a[]={s1,s2,s3,s4};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])
                a[j]=0;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}