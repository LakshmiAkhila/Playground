import java.util.Scanner;
class Main{
  public static int powernum(int m,int n)
  {
    int power=1;
    while(n>=1)
    {
      power=power*m;
      n--;
    }
    return power;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
	    int x = in.nextInt();
      int y=in.nextInt();
      System.out.print(powernum(x,y));
    }
}