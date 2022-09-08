import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
	 
	 public static void main(String[] args) {
		
		int first,last ,mid,arr[],value,num;
		
		// by usimg the scanner we get the value from the user ...
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the your number");
		num = scan.nextInt(); // here it will check weather they any next inteager in that 
	// upto the this step we done for getting the input from the user..
		// then we going to store the value in an array
		
		arr = new int [num];
		Arrays.sort(arr); // here we are sort the array
		
		System.out.println("your enerted number is ");
		
		// here we using the loop beacause to a each number in array 
		
		for (int i = 0; i < num;i++) 
			
		arr[i]= scan.nextInt();
		
		System.out.println("enter your number");
		
		value = scan.nextInt();
		first = 0;
		last = num-1;
		mid =(first + last)/2;
		
		while (first <= last) {
			
			if (arr[mid] <  value) 
				
				first = mid +1;
			else if (arr[mid] == value) 
			{
				System.out.println(value + "  " + "location of the number is   "+ (mid +1));
				break;
				}
			
			else {
				last = mid -1;
			}
			
			mid =(first + last)/2;
			
		}		 
		if (first > last) {
			System.out.println(value +"  "+"your number is not here");
		}
		
		
	}

}



