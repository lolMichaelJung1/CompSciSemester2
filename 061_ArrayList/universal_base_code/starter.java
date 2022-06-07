import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String> cookies = new ArrayList<String>();
		System.out.println("Enter an integer: ");
		int x = sc.nextInt();
		for(int i = 0; i < x; i++){
			cookies.add("cookies");
		}
		System.out.println(cookies);
		
	}
}
