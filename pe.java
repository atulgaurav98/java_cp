import java.util.*;
public class pe{        
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sosq=0,sosu=0;
        for(int i=1;i<=100;i++){
            sosq+=(i*i);
            sosu+=i;
        }
        sosu=sosu*sosu;
        int res=Math.abs(sosu-sosq);
        System.out.println(res);
        sc.close();
    }
}