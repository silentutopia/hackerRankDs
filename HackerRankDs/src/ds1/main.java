package ds1;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String args[]){
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int input[] = new int[n];
		
		for(int i=0; i<n; i++){
			input[i] = in.nextInt();
		}
		
		//Reverse string
		Collections.reverse(Arrays.asList(input));
		
		System.out.println(input);
		
	}
	
}
