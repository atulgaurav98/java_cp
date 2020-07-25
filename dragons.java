//import java.io.*;
import java.util.*;
public class dragons{
    
    public static void main(String args[]){
        int count=0;
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int l=sc.nextInt();
    int m=sc.nextInt();
    int n=sc.nextInt();
    int d=sc.nextInt();
    int a[]=new int[d];
    for(int i=0;i<d;i++){
        a[i]=i+1;
        //System.out.println(a[i]);
    }
    for(int i=0;i<d;i++){
        if(a[i]!=0&&a[i]%k==0)
        a[i]=0;
        if(a[i]!=0&&a[i]%l==0)
        a[i]=0;
        if(a[i]!=0&&a[i]%m==0)
        a[i]=0;
        if(a[i]!=0&&a[i]%n==0)
        a[i]=0;
        System.out.println(i);
    }
    for(int i=0;i<d;i++){
        if(a[i]!=0)
        count++;
    }
    System.out.println(count);
    sc.close();
    }
}