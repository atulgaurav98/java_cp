import java.util.*;
public class PetyaandStrings{
    public static void main(String args[]){
        int i=0;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().toUpperCase();
        String b=sc.nextLine().toUpperCase();
        char s1[]=a.toCharArray();
        char s2[]=b.toCharArray();
        while(i<a.length()){
            if(s1[i]==s2[i]){
                flag=0;
                i++;}
            else if(s1[i]<s2[i]){
                flag=-1;
                break;}
            else if(s1[i]>s2[i]){
                flag=1;
                break;}
        }
        System.out.println(flag);
        sc.close();
    }
}