import java.util.Scanner;
import java.lang.Math;
class armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arm, num, n, r;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		n = num;
		arm=0;
		int length = String.valueOf(n).length();
		while(n>0)
		{
			r = n % 10;
			arm+=Math.pow(r,length);
			n = n/10;
		}
		if(arm == num)
			System.out.println(num + " is armstrong");		
		else
			System.out.println(num + " is not armstrong");
	}
}