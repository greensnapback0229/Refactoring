package default_package.null_object;

public class NullObjectMain {
    public void run(){
        PersonRefactor1[] people = {
                new PersonRefactor1(new Label("Alice"), new Label("alice@example.com")),
                new PersonRefactor1(new Label("Alice"), new Label("alice@example.com")),
                new PersonRefactor1(new Label("Alice")),
        };

        for(PersonRefactor1 p : people){
            System.out.println(p.toString());
            p.display();
            System.out.println("");
        }



    }
}
