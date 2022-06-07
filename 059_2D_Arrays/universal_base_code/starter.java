import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		double sum = 0;
		int count = 0;
		int[][] arr = {{0,1,2}, {0,1,2}, {0,1,2}};
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				sum = sum + arr[i][j];
				count++;
			}
		}
		return sum / count;
	}
}
