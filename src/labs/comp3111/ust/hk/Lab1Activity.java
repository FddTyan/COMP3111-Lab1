package labs.comp3111.ust.hk;

public class Lab1Activity {
	public static void main (String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		int  min = arr[0], max = arr[0];
		
		for(int num : arr) {
			sum += num;
			if( num > max )
				max = num;
			if( num < min)
				min = num;
		}
		
		System.out.println(String.format("Sum of the numbers is %d", sum));
		System.out.print("Min = " + min + "; ");
		System.out.println("Max = " + max);
	}
}
