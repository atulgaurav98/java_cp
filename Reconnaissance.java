import java.util.*;

public class Reconnaissance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h[]=new int[n+1];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        h[n]=h[0];
        int min=Math.abs(h[0]-h[1]);
        int x=1,y=2;
        for(int i=1;i<n;i++){
            if(Math.abs(h[i]-h[i+1])<min){
                min=Math.abs(h[i]-h[i+1]);
                x=i+1;
                y=i+2;
                if(y>n-1)
                y=1;}
        } 
        System.out.println(x+" "+y);
        sc.close();
        }
    }
