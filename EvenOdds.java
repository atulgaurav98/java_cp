import java.util.*;
public class EvenOdds{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int odds = ( n + 1 ) / 2;
        if(k<=odds)
            k=2*k-1;
        else
            k=2*(k-odds);
        System.out.println(k);
        
        sc.close();
        }
    }
