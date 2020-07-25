import java.util.*;
public class LongWords{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();    
        }
        for(int i=0;i<n;i++){
            if(s[i].length()<=10)
                System.out.println(s[i]);
                else{
                    int sublength=s[i].length()-2;
                    int endindex=s[i].length()-1;
                    char begin=s[i].charAt(0);
                    char end=s[i].charAt(endindex);
                    System.out.print(begin);
                    System.out.print(sublength);
                    System.out.println(end);
                }
        }
        sc.close();
    }
}