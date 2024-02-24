package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Matrix lines: ");
		int i = scan.nextInt();
		
		System.out.println("Matrix columns: ");
		int j = scan.nextInt();
	
		int[][] mat = new int[i][j];
		
		for (int a = 0; a < i; a++) {
			for (int b = 0; b < j; b++) {
				System.out.println("Insira o valor da posição " + a + "" + b);
				mat[a][b] = scan.nextInt();
			}
		}

		for (int a = 0; a < i; a++) {
			System.out.println("");
			for (int b = 0; b < j; b++) {
				System.out.print(mat[a][b] + " ");
			}
		}
		
		System.out.println("\nSelect the number for information");
		int num = scan.nextInt();
		
		for (int a = 0; a < i; a++) {
			for (int b = 0; b < j; b++) {
				if (mat[a][b] == num) {
					System.out.println("Position: " + a + "," + b);
					
					if(b > 0) {
						System.out.println("Left: " + mat[a][b-1]);
					}
					
					if(b < mat[b].length-1) {
						System.out.println("Right: " + mat[a][b+1]);
					}
					
					if(a > 0) {
						System.out.println("Up: " + mat[a-1][b]);
					}
					
					if(a < mat.length-1) {
						System.out.println("Down: " + mat[a+1][b]);
					}
				}
			}
		}
		scan.close();
	}
}