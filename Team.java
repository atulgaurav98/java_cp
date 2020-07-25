import java.util.*;
public class Team{
    public static void main(String args[]){
        int count;
        int tcount=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int view[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                view[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<3;j++){
                if(view[i][j]==1)
                    count++;
            }
            if(count>=2)
                tcount++;
        }
        System.out.println(tcount);
        sc.close();
    }
}