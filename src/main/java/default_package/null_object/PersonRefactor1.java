package default_package.null_object;

public class PersonRefactor1 {
    private final Label _name;
    private final Label _mail;

    public PersonRefactor1(Label name, Label mail){
        _name = name;
        _mail = mail;
    }

    public PersonRefactor1(Label name){
        this(name, new Label.NullLabel());
    }

    public void display(){
        _name.display();
        _mail.display();
    }

    public String toString(){
        return "[ Person: name=" + _name + " mail=" + _mail +  " ] ";
    }
}