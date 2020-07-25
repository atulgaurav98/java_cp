import java.util.*;
public class Next{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arrn[]=new int[n];
        for(int i=0;i<n;i++)
            arrn[i]=sc.nextInt();
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<k;i++)
        {
            if(arrn[i]!=0)
                stack.add(arrn[i]);
        }
        //int qual=stack.size();
        int qual=0;
        if(stack.isEmpty())
        qual=200;
        else{
        qual=stack.size();
        
        for(int i=k;i<n;i++)
        {
            if(arrn[i]==stack.peek())
                qual++;
                else
                    break;
        }
    }
        if(qual==200)
        System.out.println(0);
        else
        System.out.println(qual);
        sc.close();
    }
}