import java.util.*;
public class Amusingjoke{
    public static void main(String args[]){
        int flag=0;
        Scanner sc=new Scanner(System.in);
        String host=sc.nextLine();
        String guest=sc.nextLine();
        String random=sc.nextLine();
        char h[]=host.toCharArray();
        char g[]=guest.toCharArray();
        char r[]=random.toCharArray();
        int a[]=new int[26];
        for(int i=0;i<host.length();i++){
            int hi=h[i]-'A';
            a[hi]++;
        }
        for(int i=0;i<guest.length();i++){
            int gi=g[i]-'A';
            a[gi]++;
        }
        for(int i=0;i<random.length();i++){
            int ri=r[i]-'A';
            a[ri]--;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=0)
                flag=1;
                
        }
        if(flag==1)
            System.out.println("NO");
            else
            System.out.println("YES"); 
        sc.close();
    }
}