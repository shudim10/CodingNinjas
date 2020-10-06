package recursion1;

import java.util.Scanner;

public class FirstIndexOfNumber {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static int firstIndex(int input[], int x) {
		if(input.length == 0){
			return -1;
		}
		if(input[0] == x){
			return 0;
		} 
		int b [] = new int[input.length-1];
		for(int i = 1; i < input.length; i++){
			b[i-1] = input[i];
		}

		int index = firstIndex(b, x);
		if(index == -1) {
			return -1;
		} else {
			return index + 1; 
		}
		
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}
}
