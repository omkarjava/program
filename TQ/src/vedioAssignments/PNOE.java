package vedioAssignments;

public class PNOE {

	public static void main(String[] args) {
		int a[] = { 1, 2, -5, 5, 9, 8, -9, -2, 8, 4, 5, 3, 7, 9, 1 };
		System.out.println("Negative Nos ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0)
				System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Positive Nos ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Even Nos ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && a[i]>0)
				System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Odd Nos ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1 && a[i]>0)
				System.out.print(a[i] + " ");
		}

	}

}
