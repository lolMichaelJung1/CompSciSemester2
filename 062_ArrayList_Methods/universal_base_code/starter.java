import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> arr1 = new ArrayList<Integer>();		
	System.out.println("Choose how many values you want in the ArrayList: ");
	int x = sc.nextInt();
	for(int i = 0; i < x; i++){
		    Integer a = new Integer((int)(Math.random()*10)); 
			//System.out.println(a);
			arr1.add(a);
	}
	System.out.println(" ");
	System.out.println(" ");
	toStringArrayList(arr1);
	System.out.println(getArrayListMaximum(arr1));
	System.out.println(" ");
	}
	
	public static void toStringArrayList(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.println(arr.get(i));
		}
	}
	public void getArrayListAverage(ArrayList<Integer> arr){
		int total = 0;
		int avg = 0;
		for(int i = 0; i<arr.size(); i++)
    	total = total+arr.get(i);
		avg = total / arr.size();
		System.out.println(avg);
	}
	
	public static int getArrayListMaximum(ArrayList<Integer> arr){
		int currentMax = arr.get(0);
		for(int i = 1; i < arr.size(); i++){
			if(arr.get(i)>currentMax){
				currentMax = arr.get(i);
			}
		}
		return currentMax; 
	}
	public static int getArrayListMinimum(ArrayList<Integer> arr){
		int currentMin = arr.get(0);
		for(int i = 1; i < arr.size(); i++){
			if(arr.get(i) < currentMin){
				currentMin = arr.get(i);
			}
		}
		return currentMin; 
	}
}
