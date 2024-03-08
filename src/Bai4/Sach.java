package Bai4;

public class Sach {
    private String title;
    private String author;
    private String publisher;

    public Sach(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Sach() {
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public String getInfo() {
        return "Tiêu đề: " + title + "\n" +
                "Tác giả: " + author + "\n" +
                "Nhà xuất bản: " + publisher;
    }
}

class Main {

    public static void main(String[] args) {

        Sach book = new Sach("Dragon Ball Super", "Akira Toriyama", "Bandainamco");
        System.out.println(book.getInfo());

        SachVienTuong fictionBook = new SachVienTuong(" Frankenstein", "Mary Shelley", "H.M.H", "Horror");
        System.out.println(fictionBook.getInfo());

        SachPhiHuCau nonFictionBook = new SachPhiHuCau("Lời nguyện cầu từ Chernobyl", "Svetlana Alexandrovna Alexievich", "........", "Life");
        System.out.println(nonFictionBook.getInfo());

        SachKhoaHoc scienceBook = new SachKhoaHoc("Vũ Trụ", "Carl Sagan", "Bantam Books", "Cosmology", "Science");
        System.out.println(scienceBook.getInfo());
    }
}
class SachVienTuong extends Sach {

    private String genre;

    public SachVienTuong(String title, String author, String publisher, String genre) {
        super(title, author, publisher);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
class SachPhiHuCau extends Sach {

    private String subject;

    public SachPhiHuCau(String title, String author, String publisher, String subject) {
        super(title, author, publisher);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "NonFictionBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
class SachKhoaHoc extends SachPhiHuCau {

    private String scienceField;

    public SachKhoaHoc(String title, String author, String publisher, String subject, String scienceField) {
        super(title, author, publisher, subject);
        this.scienceField = scienceField;
    }

    public String scienceField() {
        return scienceField;
    }

    public void scienceField(String scienceField) {
        this.scienceField = scienceField;
    }

    @Override
    public String toString() {
        return "ScienceBook{" +
                "scienceField='" + scienceField + '\'' +
                '}';
    }
}
