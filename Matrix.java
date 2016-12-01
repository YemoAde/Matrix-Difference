import java.io.*;
import java.lang.*;
import java.util.*;

public class Matrix{
	static Scanner console = new Scanner(System.in);
	public static int leftDiag(int[][] data, int n){
		int sum = 0;
		for(int i = 0; i < n;i++){
			sum = sum + data[i][i];
		}
		return sum;
	}
	public static int rightDiag(int[][] data, int n){
		int sum = 0;

		for(int i = 0; i < n; i++){
			sum = sum + data[i][(n-1)-i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int n;
		System.out.println("Enter N");
		n = console.nextInt();
		int[][] data = new int[n][n];

		for(int i=0;i< n;i++){
			for(int j=0;j< n;j++){
				data[i][j]= console.nextInt();
			}
		}

		System.out.println(rightDiag(data, n));
		System.out.println(leftDiag(data, n));
		System.out.println("Difference is " + Math.abs(leftDiag(data, n) - rightDiag(data,n)));
	}
}