package default_package.extract_class;

public class BookRefactor2 {
    private String _title;
    private String _isbn;
    private String _price;
    private Author _author;

    public BookRefactor2(String title, String isbn, String price, String authorName, String authorMail){
        _title = title;
        _isbn = isbn;
        _price = price;
        _author = new Author(authorName, authorMail);
    }

    public String getTitle(){
        return _title;
    }

    public String getIsbn(){
        return _isbn;
    }
    public String getPrice(){
        return _price;
    }

    public String getAuthorName(){
        return _author.getName();
    }
    public String getAuthorMail(){
        return _author.getMail();
    }

    public void setAuthorName(String name){
        _author.setName(name);
    }

    public void setAuthorMail(String mail){
        _author.setMail(mail);
    }

    public ImmutableAuthor getAuthor(){
        return _author;
    }

    public String toXml(){
        String author = tag("author", tag("Name", _author.getName())) + tag("mail", _author.getMail());
        String book = tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }

    private String tag(String element, String content){
        return "<" + element + ">" + content + "</" + element + ">";
    }
}