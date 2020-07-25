//import java.lang.*;
import java.util.*;

public class ultrafast{
    public static void main(String args[])throws Exception{
    Scanner scan=new Scanner(System.in);
    char ch1[]=scan.next().toCharArray();
    char ch2[]=scan.next().toCharArray();    
    for(int i=0;i<ch1.length;i++){    
        if(ch1[i]==ch2[i])
        System.out.print("0");
        else
        System.out.print("1");
    }
    scan.close();
    }
}