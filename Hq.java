import java.util.*;
public class Hq{
    public static void main(String args[]){
        int flag=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
             if(ch[i]=='H'||ch[i]=='Q'||ch[i]=='9')
                    flag=1;
        }
        if(flag==1)
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
    }
}