import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	//outer is how many values sorted
	//inner is how many values that need to be sorted 
	public static void bubblesort(int[] arr){
		for(int outer = 0; outer < arr.length-1; outer++){
			for(int inner = 0; inner < arr.length-outer-1; inner++){
				if(arr[inner] > arr[inner+1]){
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
	}
		
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
	public static void selectionSort(int[] arr){
		int outer, inner, key;
		for(outer = 1; outer < arr.length; outer++){
			key = arr[outer];
			inner = outer -1;
			while(inner >= 0 && arr[inner] > key){
				arr[inner + 1] = arr[inner];
				inner--;
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
		bubblesort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
