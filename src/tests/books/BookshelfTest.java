package tests.books;

import java.util.Scanner;

public class BookshelfTest {
	public static void main(String[] args) {
		int inputMenuOption;
		Bookshelf shelf = new Bookshelf();

		Scanner scan = new Scanner(System.in);

		System.out.println("     Меню");
		System.out.println("1. Информация о полке.");
		System.out.println("2. Добавить книгу.");
		System.out.println("3. Удалить книгу.");
		System.out.println("4. Информацяи о книге.");
		System.out.println("5. ");
		System.out.println("6. ");
		System.out.println("Для выбора необходимого действия введите соответсвующий номер,"
				+ "для прекращения работы напишите 'end'");
		inputMenuOption = scan.nextInt();
		System.out.println(inputMenuOption);
		shelf.MyBookShelf(inputMenuOption);

	}

}