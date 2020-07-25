import java.util.*;

public class Sumr{
    public static void main(String args[]){  
        ArrayList<Integer> arr=new ArrayList<Integer>();     
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            
            int n=sc.nextInt();
            int k=0;int ele=1;
            while(n!=0){
               int r=n%10;
               if(r!=0){
                    k++;
                   
                    arr.add(r*ele);
                   }
                   ele*=10;
                n=n/10;
            }
            System.out.println(k);
             for(int i=arr.size()-1;i>=0;i--){
                System.out.print(arr.get(i)+" ");
            }
            arr.clear();
            t--;
        }
        sc.close();
    }
}