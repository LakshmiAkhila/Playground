import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in  = new Scanner(System.in);
      
	    int n = in.nextInt();
	    for(int i = 1; i <= n; ++i)
	    {
         
	        for(int space = 1; space <=  n - i; space++)
	        {
	            System.out.print(" ");
	        }
          
	        for(int curr_col = 1; curr_col <= (2 * i - 1); ++curr_col)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}