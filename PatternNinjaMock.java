import java.util.Scanner;

public class PatternNinjaMock {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
		//pattern1
        for(int i=0;i<N;i++){
            System.out.print("#");
        }
        System.out.println();
        //pattern 2
        for(int i=0;i<N-2;i++){
            System.out.print("*");
            for(int j=0;j<N-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        // pattern 3
        for(int i=0;i<N;i++){
            System.out.print("#");
        }
		// Write your code here

	}

}