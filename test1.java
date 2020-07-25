//import java.io.*;
import java.util.*;
public class test1{
    static double tv;
    public static void main(String args[]){
       double vop=0.0;
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    vop+=((double)a[i])/100.0;
    }
    test1.tv=(vop/n)*100.0;
    System.out.println(test1.tv);
    sc.close();
    }
}