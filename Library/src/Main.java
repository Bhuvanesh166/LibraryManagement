class LibraryItems{
    private int id,year,price;
    String title;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Book extends LibraryItems{
    String author;
    Book(String author,String title){
        this.author=author;
        super.title=title;
    }



}
class Magazine extends LibraryItems{
    int issues;
    Magazine(int issues,String title){
        this.issues=issues;
        super.title=title;
    }
}
class Main{
    public static void main(String[] args) {
        Book book =new Book("Valluvar","Thirukural");
        Magazine magazine =new Magazine(2,"Mario");
        book.setId(2);
        book.setYear(1066);
        book.setPrice(2500);
        magazine.setId(3);
        magazine.setYear(1997);
        magazine.setPrice(500);
        System.out.println("Book_Id: "+book.getId());
        System.out.println("Book_Year: "+book.getYear());
        System.out.println("Book_Title: "+book.title);
        System.out.println("Book_Author: "+book.author);
        System.out.println("Book_Price: "+book.getPrice());
        System.out.println("Magazine_Id: "+magazine.getId());
        System.out.println("Magazine_Year: "+magazine.getYear());
        System.out.println("Magazine_Title: "+magazine.title);
        System.out.println("Magazine_Price: "+magazine.getPrice());
        System.out.println("Issues: "+magazine.issues);
    }
}