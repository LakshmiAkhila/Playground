import java.util.Scanner;
class Main{
  public static int greatest(int x,int y,int z)
  {
   
    if(x>y)
    {
      return x;
    }
    else if(y>z)
    {
     return y;
    }
    else
    {
      return z;
    }
  
  }
  
	public static void main (String[] args){
	    // Type your code here
      
   
      Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
       int n2 = in.nextInt();
       int n3 = in.nextInt();
      
      System.out.println(greatest(n1,n2,n3));
      
	}
	
}