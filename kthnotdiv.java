import java.util.*;
public class kthnotdiv{
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
        int n=sc.nextInt();
        int k=sc.nextInt();
       
        for(int i=1;i<(2*k);i++){
            if(i%n!=0)
                arr.add(i);
        }

        System.out.println(arr.get(k-1));
        arr.clear();
    t--;}
        sc.close();
    }
}