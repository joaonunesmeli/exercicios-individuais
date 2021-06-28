package bootcamp.java.mod5.aula4.tm.exerc2;

public class Book {
    private String title;
    private String author;
    private String isbn;

    private boolean taken;

    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void take() throws Exception {
        if (taken) {
            throw new Exception("Este livro já foi alugado");
        }
        taken = true;
    }

    public void giveBack() throws Exception {
        if (!taken) {
            throw new Exception("Vai mesmo retornar um livro que nunca pegou?");
        }
        taken = false;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", title, isbn, author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
