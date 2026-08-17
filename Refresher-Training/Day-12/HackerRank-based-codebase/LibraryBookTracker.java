public class Book{
	private String title;
	private String author;
	private String isbn;
	
	private static int totalBooksInLibrary = 0;
    private static int totalBooksCheckedOut = 0;

    private boolean checkedOut = false;
	
	public Book(String title, String author, String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		
		totalBooksInLibrary++;
	}
	
	public void checkOut(){
		if (!checkedOut){
			checkedOut = true;
			totalBooksCheckedOut++;
		}
	} 
	
	public void return(){
		if (checkedOut){
			checkedOut = false;
			totalBooksCheckedOut--;
		}
	}
	
	public static int getTotalBooksInLibrary() {
        return totalBooksInLibrary;
    }

    public static int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }
	
	public static void main(String args[]){
		Book b1 = new Book("Harry Potter", "J.K Rolling", "1");
		Book b2 = new Book("House of the dragon", "George R. R. Martin and Ryan Condal", "2");
		Book b3 = new Book("One Piece", "Oda Sensai", "3");
		
		b1.checkOut();
        b2.checkOut();

        b1.returnBook();
		
		System.out.println("Total Books in Library: "
                + Book.getTotalBooksInLibrary());

        System.out.println("Total Books Checked Out: "
                + Book.getTotalBooksCheckedOut());
	}
}