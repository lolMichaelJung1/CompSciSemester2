import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void insertionSort(int[] arr){
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = i-1;
			while((j > -1)&&(arr[j]>temp)){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}

	
	public static void main(String args[]) {
	int[] arr = new int[200];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (((int)(Math.random()*101)));
			System.out.print(arr[i] + " ");
	}
	System.out.println(" ");
	System.out.println(" ");
	insertionSort(arr);
	for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
	}

		
	}
}
