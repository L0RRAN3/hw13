public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " от " + author.toString() + ", Год публикации: " + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return Objects.equals(title, other.title)
                && Objects.equals(author, other.author)
                && year == other.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author other = (Author) obj;
        return Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Мария", "Петрова");

        Book book1 = new Book("Книга 1", author1, 2000);
        Book book2 = new Book("Книга 2", author2, 2010);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println("Книга 1 равна Книге 2: " + book1.equals(book2));
        System.out.println("Автор 1 равен Автору 2: " + author1.equals(author2));
    }
}
