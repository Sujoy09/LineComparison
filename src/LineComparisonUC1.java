import java.util.Scanner;

public class LineComparisonUC1 {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		int x1,x2,y1,y2;
		double dis;
		System.out.println("Enter x1 position");
		x1=sc.nextInt();
		System.out.println("Enter y1 position");
		y1=sc.nextInt();
		System.out.println("Enter x2 position");
		x2=sc.nextInt();
		System.out.println("Enter y2 position");
		y2=sc.nextInt();
		dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.println("Distance Between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}
}
