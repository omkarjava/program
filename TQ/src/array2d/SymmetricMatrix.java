package array2d;

import java.util.Scanner;

public class SymmetricMatrix {
	void Symmetric(int a[][], int r, int c) {
		int d[][] = new int[c][r];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				d[i][j] = a[j][i];
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		int b = 0;
		for (int i = 0; i < c; i++) 
		{
			for (int j = 0; j < r; j++) 
			{
				if (d[i][j] == a[i][j]) 
				{
					b++;
				}
			}
			System.out.println();
		}
		if (b == (c * r)) 
		{
			System.out.println("Symmetric");
		} else
			System.out.println("Not Symmetric");

	    }

	void displayarray(int a[][], int r, int c) {
		System.out.println("Elements Of Array:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Rows And Coloum");
		r = sc.nextInt();
		c = sc.nextInt();

		int a[][] = new int[r][c];

		System.out.println("Enter " + (r * c) + " Elements:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				a[i][j] = sc.nextInt();
			}
		}
		SymmetricMatrix b = new SymmetricMatrix();
		b.Symmetric(a, r, c);
		b.displayarray(a, r, c);

	}

}
