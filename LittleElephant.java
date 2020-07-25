import java.util.*;
public class LittleElephant{
    public static void main(String args[]){
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        Set<Integer> set=new HashSet<Integer>(n);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            set.add(a[i]);
        }
        if(set.size()!=n)
            flag=1;
        int count=1;
        int min=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min=a[i];
                count=i+1;
            }
        }
        if(flag==1)
            System.out.println("Still Rozdil");
        else
            System.out.println(count);
        sc.close();
    }
}