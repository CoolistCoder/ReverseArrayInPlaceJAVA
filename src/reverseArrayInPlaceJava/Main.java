package reverseArrayInPlaceJava;
import java.util.Arrays;

//basic example of a reverse in place on an array in Java

public class Main {
	public static void reverseInPlace(int[] arr) {
		int store; 								//used in store for swap
		for (int i=0;i<arr.length/2;i++) {		//iterate through half the array
			store = arr[i];						//perform swap between the base index and opposite equivalent index
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = store;
		}
	}

	public static void main(String[] args) {
		int testarr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};	//base integer array
		reverseInPlace(testarr);						//perform reverse in place
		System.out.println(Arrays.toString(testarr));	//print the array as a string
	}

}
