import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void selectionSort(int[] arr){
		int outer, inner, key;
		for(outer = 1; outer < arr.length; outer++){
			key = arr[outer];
			inner = outer-1;
			
			while(inner >= 0 && arr[inner] > key){
				arr[inner + 1] = arr[inner];
				inner = inner-1;
			}
			arr[inner + 1] = key;
		}
	}
	public static void main(String args[]) {
	int[] arr = new int[200];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (((int)(Math.random()*10)));
			System.out.print(arr[i] + " ");
	}
	System.out.println(" ");
	System.out.println(" ");
	selectionSort(arr);
	for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
	}

		
	}
}
