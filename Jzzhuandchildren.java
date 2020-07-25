
import java.util.*;
public class Jzzhuandchildren{
    static void leftRotate(int noc[],int n){
        int i;
        for(i=0;i<n-1;i++){
            noc[i]=noc[i+1];
        }
        noc[i]=0;

    }
    static void leftRotate2(int noc[],int n,int left){
        int i;
        for(i=0;i<n-1;i++){
            noc[i]=noc[i+1];
        }
        noc[i]=left;

    }
    public static void main(String args[]){
        int leftval;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int noc[]=new int[n];
        for(int i=0;i<n;i++){
            noc[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(noc[i]<=m)
            Jzzhuandchildren.leftRotate(noc,m);
            else{
                noc[i]=noc[i]-m;
                leftval=noc[i];
                leftRotate2(noc, n, leftval);
            }

        }
        sc.close();
    }
}