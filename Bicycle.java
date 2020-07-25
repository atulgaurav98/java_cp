import java.util.*;
public class Bicycle{
    public static void main(String args[]){
        int gr;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
    
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    if(b[j]%a[i]!=0)
                        break;
                    else{
                        gr=b[j]/a[i];
                        arr.add(gr);
                    }
                    
           
            }
        }
        //System.out.print(k);
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        /*int max=Collections.max(arr);
        /*for(int i=1;i<arr.size();i++){
            if(max<arr.remove(i))
                max=arr.remove(i);
        }
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.remove(i)==max)
                count++;
        }
        System.out.println(count);*/
        sc.close();
    }
}