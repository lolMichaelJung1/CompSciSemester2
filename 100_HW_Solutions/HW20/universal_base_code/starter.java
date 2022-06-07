import java.util.*;

class starter {
		public static void bubbleSort(int[] arr){
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
	public static int arrayMedian(int[] arr){
		if(arr.length/2 == 0){
			return (arr[arr.length / 2] + arr[arr.length/2+1])/2;			
		}
		else{
			return arr[arr.length/2];
		}
	}
	public static void printArray(int[] arr){
		System.out.println(" ");
		System.out.println("The array has values: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String args[]) {
		int[] arr = new int[100];
		System.out.println("The array has values: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = (((int)(Math.random()*101)));
			System.out.print(arr[i] + " ");
		}
		bubbleSort(arr);
		printArray(arr);
		insertionSort(arr);
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
		System.out.println(" ");
		System.out.println("The median of the array is:");
		System.out.println(arrayMedian(arr));
	}
}
