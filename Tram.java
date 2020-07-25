import java.util.*;
public class Tram{
int total,max;
    public static void main(String args[]){
        int total=0,max=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int exit[]=new int[n];
        int entry[]=new int[n];
        for(int i=0;i<n;i++){
            exit[i]=sc.nextInt();
            entry[i]=sc.nextInt();
        }
        total=entry[0]-exit[0];
        max=total;
        for(int i=1;i<n;i++){
            total-=exit[i];
            total+=entry[i];
            if(max<total)
                max=total;
        }
        System.out.println(max);
        sc.close();
    }
}