package stars;

public class Stars {

	public void printStars(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println("\n");
	}

	public void printStarSquare(int n) {
		int row = 0;
		for (int i = 0; i < n; i++) {
			for (row = 0; row < n; row++) {
				System.out.print("*");
			}
			System.out.println();
			row = 0;
		}
		System.out.println();
	}

	public void printStarGrid(int n) {
		int row = 0;
		boolean odd = true;
		for (int i = 0; i < n; i++) {
			for (row = 0; row < n; row++) {
				if (odd)
					System.out.print("*");
				else
					System.out.print(" ");
				odd = !odd;
			}
			System.out.println();
			row = 0;
		}
		System.out.println();
	}

	public void printStarTriangle(int n) {
		int row = 0;
		for (int i = 0; i < n; i++) {
			for (; row <= i; row++) {
				System.out.print("*");
			}
			System.out.println();
			row = 0;
		}
		System.out.println();
	}

	public void printStarInvertedTriangle(int n) {
		for (int i = n; i > 0; i--) {
			for (int b = 0; b < i - 1; b++) {
				System.out.print(" ");
			}

			for (int c = 0; c < n + 1 - i; c++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public void printStarPyramid(int n) {
		for (int i = n; i > 0; i--) {
			for (int b = 0; b < i - 1; b++) {
				System.out.print(" ");
			}

			for (int c = 0; c <= n - i; c++) {
				System.out.print("*");
			}

			for (int c = 0; c < n - i; c++) {
				System.out.print("*");
			}

			for (int b = 0; b < i - 1; b++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public void printStarDiamond(int n) {
		if (n % 2 == 0) {
			for (int i = 1; i < n; i += 2) {
				for (int k = n; k >= i; k -= 2) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			for (int i = 1; i <= n; i += 2) {
				for (int k = 1; k <= i; k += 2) {
					System.out.print(" ");
				}
				for (int j = n; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i < n; i += 2) {
				for (int k = n; k >= i; k -= 2) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			for (int i = 1; i <= n; i += 2) {
				for (int k = 1; k <= i; k += 2) {
					System.out.print(" ");
				}
				for (int j = n; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.print("\n");
	}
}
