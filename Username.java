//import java.io.*;
import java.util.*;
public class Username{
    static int count;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int score[]=new int[n];
        for(int i=0;i<n;i++){
            score[i]=sc.nextInt();
        }
        int least=score[0];
        int most=score[0];
        for(int i=1;i<n;i++){
            if(score[i]<least){
                Username.count++;
                least=score[i];
            }
            if(score[i]>most){
                Username.count++;
                most=score[i];
            }
        }
        System.out.println(Username.count);
        sc.close();
    }
}