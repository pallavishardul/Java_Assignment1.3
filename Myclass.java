public class Myclass
{
	public static void main (String a[])
	{
		int first = 5;
		int second = 2;
		System.out.println("numbers before swapping : "+first+","+second);
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("numbers before swapping : "+first+","+second);
		
	}
}