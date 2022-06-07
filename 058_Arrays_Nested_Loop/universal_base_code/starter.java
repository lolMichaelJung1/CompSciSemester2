import pkg.*;
import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String c = " ";
	System.out.println("Input the character: ");
    c = sc.nextLine();
	System.out.println("Input the height of the box: ");
	int a = sc.nextInt();
	System.out.println("Input the width of the box: ");
	int b = sc.nextInt();
	String[][] arr = new String[a][b];
	for(int i = 0; i < arr.length; i++){
		for(int j = 0; j < arr[0].length; j++){
			System.out.println((arr[i][j] = c) + " ");
		}
	}
		
	}
}
