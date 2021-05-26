import java.util.Scanner;

public class LineComparisonUC4 {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		int x1,y1,x2,y2;
		System.out.println("Enter 1st Line Co-ordinate: ");
		System.out.println("Enter x1 point ");
		x1=sc.nextInt();
		System.out.println("Enter y1 point ");
		y1=sc.nextInt();
		System.out.println("Enter x2 point ");
		x2=sc.nextInt();
		System.out.println("Enter y2 point ");
		y2=sc.nextInt();
		Integer distofline1=(int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		int x3,y3,x4,y4;
		System.out.println("Enter 2nd Line Co-ordinate: ");
		System.out.println("Enter x3 point ");
		x3=sc.nextInt();
		System.out.println("Enter y3 point ");
		y3=sc.nextInt();
		System.out.println("Enter x4 point ");
		x4=sc.nextInt();
		System.out.println("Enter y4 point ");
		y4=sc.nextInt();
		Integer distofline2=(int)Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4));
		int compareResult = distofline1.compareTo(distofline2);
		System.out.println("distofline1 & distanceofline2 comparison: "+compareResult);
		}
	}
