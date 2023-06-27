package Lab_3;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter any element : ");
		int size = ob.nextInt();
		int array[] = new int[size];
		
		for(int i =0 ;i<array.length;i++) 
		{
			array[i]=ob.nextInt();
		}
		int small = array[0];
		int big = array[0];
		for(int i =0 ;i<array.length;i++) 
		{
			if(small>=array[i])
			{
				small=array[i];
			}
			if(big<=array[i])
			{
				big=array[i];
			}
		}
		System.out.println("SAMLLEST : "+small);
		System.out.println("BIGGEST : "+big);
		
	}
}
