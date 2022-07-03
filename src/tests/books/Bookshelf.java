package tests.books;

public class Bookshelf {
	
	Book [] bookShelf = new Book[10];
    public void MyBookShelf(int inpitMenuOption) {
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

    	} else if(inpitMenuOption == 3) {

    	} else if(inpitMenuOption == 4) {

    	} else if(inpitMenuOption == 5) {

    	} else if(inpitMenuOption == 6) {

    	}
    }

}