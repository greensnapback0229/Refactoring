package default_package.uml_practice;

public class ChildClass extends ParentClass implements Executable{

    @Override
    public void method1(){
        System.out.println("method1_in_childclass");
    }

    @Override
    public void execute() {
        System.out.println("execute");
    }
}
