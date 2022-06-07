import java.util.*;
import java.util.ArrayList;
class starter {
	
	public static void printArray(ArrayList<Integer> arr){
			this.arr();
		}
	}
	public static void addValuesArrayList(ArrayList<Integer> arr, int n){
		this.n = n;
		for(int i = 0; i < n; i++){
			arr.add((int)(Math.random()*101));
		}
	}
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();  
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values do you want to add to the array list? ");
		int n = sc.nextInt();
		printArray(arr);
		addValuesArrayList(arr);

		

	}
}
