package masteryws;

public class ClassObjGetSet {
    // Create a Book class with attributes: title, author, and price.
    // Write a program to create 3 book objects, store them in an array, and print details of the most expensive one.

    public static void main(String[] args)
    {
        Book[] books = new Book[6];

        System.out.println("Creating an array of 3 Books: ");
        books[0] = new Book("Little Women", "Louisa May Alcott", 200);
        books[1] = new Book("House of Cards", "Sudha Murthy", 150);
        books[2] = new Book("It Ends With Us", "Colleen Hoover", 400);
        books[3] = new Book();
        books[4] = new Book("Harry Potter", "J K Rowling", 600);
        books[5] = new Book(books[4]);

        books[0].setPrice(-50); // Price set to 0
        books[0].setTitle("Rose in Bloom");
        System.out.println(STR."New Price of \{books[0].getTitle()} : \{books[0].getPrice()}");

        books[2].setPrice(100);
        System.out.println(STR."New Price of \{books[2].getTitle()} : \{books[2].getPrice()}");

        Book mostExpensive = books[0];
        for (int i = 1; i < books.length; i++)
        {
            if (books[i].getPrice() > mostExpensive.getPrice())
            {
                mostExpensive = books[i];
            }
        }
        System.out.printf("Most expensive book is %s", mostExpensive.toString());
    }
}

class Book
{
    private String title;
    private String author;
    private int price;

    // creating parametrised constructor
    public Book(String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        setPrice(price);
    }

    // default constructor
    public Book()
    {
        title = "";
        author = "";
        price = 0;
    }

    // Copy constructor
    public Book(Book other)
    {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    // getter methods for each
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getPrice()
    {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price)
    {
        if (price < 0)
        {
            System.out.println("Warning : Price cannot be negative. Setting price to 0.");
            this.price = 0;
        }
        else
            this.price = price;
    }

    // output method
    public String toString()
    {
        return "Title: \"%s\", Author: %s, Price: Rs.%s".formatted(title, author, String.format("%d", price));
    }
}
