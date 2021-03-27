import java.util.Scanner;

public class LineComparisonUC2 {
	static boolean equals (double length1, double length2)
	{
		if(length1 == length2)
		{
			return true;
		}
		return false;
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		int x1,y1,x2,y2;
		System.out.println("Enter 1st Line Co-ordinate: ");
		System.out.println("Enter x1 Point ");
		x1=sc.nextInt();
		System.out.println("Enter y1 Point ");
		y1=sc.nextInt();
		System.out.println("Enter x2 Point ");
		x2=sc.nextInt();
		System.out.println("Enter y2 Point ");
		y2=sc.nextInt();
		double distofline1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		int x3,y3,x4,y4;
		System.out.println("Enter 2nd Line Co-ordinate: ");
		System.out.println("Enter x3 Point ");
		x3=sc.nextInt();
		System.out.println("Enter y3 Point ");
		y3=sc.nextInt();
		System.out.println("Enter x4 Point ");
		x4=sc.nextInt();
		System.out.println("Enter y4 Point ");
		y4=sc.nextInt();
		double distofline2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
		boolean checkEquality = equals(distofline1,distofline2);
		if (checkEquality)
			System.out.println("Both Lines are Equal");
	}
}
