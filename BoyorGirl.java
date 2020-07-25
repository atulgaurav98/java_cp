import java.util.*;
public class BoyorGirl{
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(ch[i]==ch[j])
                    ch[j]='@';
            }
        }
        for(int i=0;i<s.length();i++){
            if(ch[i]=='@')
                count++;
        }
        int check=s.length()-count;
        if(check%2==0)
            System.out.println("CHAT WITH HER!");
                else
                    System.out.println("IGNORE HIM!");
        sc.close();
    }
}