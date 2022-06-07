import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public void printArr(int[][] arr){
		
	}
	public void calculate(int[][] arr){
		for(int i = 0; ){
			
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the height of the box: ");
		int a = sc.nextInt();
		System.out.println("Input the width of the box: ");
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j <arr[0].length; j++){
				arr[i][j] = ((int)(Math.random()*11));
				System.out.println(arr[i][j]);
			}
		}

		
	}
}
