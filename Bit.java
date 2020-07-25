import java.util.*;
public class Bit{
    public static void main(String args[])throws Exception{
        int x=0;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s[]=new String[t];
        for(int i=0;i<t;i++){
            s[i]=sc.next();
            if(s[i].charAt(0)=='x'||s[i].charAt(0)=='X')
            {
                if(s[i].charAt(1)=='+')
                x++;
                else
                x--;
            }
            else
            {
                if(s[i].charAt(0)=='+')
                ++x;
                else
                --x;
            }
            
        }
        System.out.println(x);
        sc.close();
        
        
    }
}