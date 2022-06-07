// import pkg.*;
import java.util.ArrayList;
class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		System.out.println();
		System.out.println();
		printValuesInt(arr1);
	}
	public static void removeDup(ArrayList<Integer> arr) {
		for(int i = arr.size()-1; i > 0; i--) {
	        for(int j = i-1; j >= 0; j--) {
	            if(arr.get(i).equals(arr.get(j))) {
                arr.remove(i);
                break;
            }
        }
    }
	}
	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}

