import java.util.Scanner;
public class Main{
  public static  int gcdnum(int n1, int n2,int n3)
  {
    int min;
   int  gcd=0;
    if(n1<n2)
    {
      min= n1;
    }
    else if(n2<n3)
    {
      min=n2;
    }
    else
    {
      min=n3;
    }
    while(min>=1)
    {
  
      if((n1%min==0)&&(n2%min==0)&&(n3%min==0))
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
      Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
              int n2=in.nextInt();
              int n3=in.nextInt();
      System.out.println(gcdnum(n1,n2,n3));
	
	    // Type your code here
	}
}