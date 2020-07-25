

import java.util.*;
public class Petrandbook{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int day[]=new int[7];
        for(int i=0;i<7;i++){
            day[i]=sc.nextInt();
        }
        int i=0,endday=0;
        while(i<7){
            n=n-day[i];
            if(n<=0){
                endday=i+1;
                break;}
            if(i==6)
                i=-1;
            i++;
        }
        System.out.println(endday);
    sc.close();
    }
}