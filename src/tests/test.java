package tests;

public class test {
	
	public static int[] numbers = new int[] {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};
	
	public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }

//	public static int[] numbers = new int[10];
//
//	public static void main(String[] args) {
//		init();
//		print();
//
//	reverse();
//	print();
//	}
//
//	public static void init() {
//		for (int i = 0; i < 10; i++) {
//			numbers[i] = i;
//		}
//	}
//
//	public static void reverse() {
//		int n = numbers.length - 1;
//		for (int i = 0; i < numbers.length / 2; i++) {
//			int temp = numbers[i];
//			numbers[i] = numbers[n - i];
//			numbers[n - i] = temp;
//		}
//	}
//
//	private static void print() {
//		for (int number : numbers) {
//			System.out.println(number);
//		}
//	}

}
