import java.io.*;

import java.util.*;


public class test {

    /*
     * Complete the twoStacks function below.
    */
    static int twoStacks(int x, int[] a, int[] b) {
        int sum=0,count=0;
        Stack<Integer> A=new Stack<Integer>();
        Stack<Integer> B=new Stack<Integer>();
        for(int i=0;i<a.length;i++){
            A.push(a[i]);
        }
        for(int i=0;i<b.length;i++){
            B.push(b[i]);
        }
        while(sum<=x){
            if(A.peek()<B.peek()){
                sum+=A.peek();
                A.pop();
            }
            else{
                sum+=B.peek();
                B.pop();
            }
            count++; 
        }
        return (count-1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
