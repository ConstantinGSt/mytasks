package tests.books;
import java.util.Scanner;
public class Bookshelf {
	
	Book [] bookShelf = new Book[10];
	Book book;
    public void MyBookShelf(int inpitMenuOption) {
    	Scanner scan = new Scanner(System.in);
    	if(inpitMenuOption == 1) { // info for bookShelf
    		int booksInShelf = 0;
			int freeInShelf = 0;
    		for(int i = 0; i < bookShelf.length; i++) {
    			if(bookShelf[i] !=null) {
    				booksInShelf++;
    			System.out.print("[K]");
    			} else if(bookShelf[i] == null) {
    				System.out.print("[]");	
    				freeInShelf++;
    			}
    		}
    		System.out.println("\n" + "Книг на полке: " + booksInShelf + "\n" 
    				+ "Свободное место для " + freeInShelf + " книг"  );
    	} else if(inpitMenuOption == 2) {
    		for(int i = 0; i < bookShelf.length; i++) {
    			if(bookShelf[i] == null) {
    				System.out.println("Добавьте книгу в следующем формате: Автор Enter" + "\n"
    			+ "Название Enter"  + "\n" + "год издания Enter");
    				book = new Book(book.autor, book.title, book.published) {
    					book.autor = scan.nextLine();
    					book.title = scan.nextLine();
    					book.published = scan.nextLine();
    				}
    			}
    		}
    		
    	} else if(inpitMenuOption == 3) {

    	} else if(inpitMenuOption == 4) {

    	} else if(inpitMenuOption == 5) {

    	} else if(inpitMenuOption == 6) {

    	}
    }
}