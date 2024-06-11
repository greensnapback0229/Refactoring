package default_package.extract_class;

public class ExtractClassMain {
    public void run(){
        BookRefactor2 refactoring = new BookRefactor2(
            "Refactoring: imporving the design of existing code",
            "ISBN0201485672",
            "$44.95",
            "Martin Fowler",
            "fowler@acm.org"
        );

        BookRefactor2 math = new BookRefactor2(
                "프로그래머 수학",
                "ISBN4797329734",
                "20000원",
                "유키 히로시",
                "hyki@yuki.com"
        );

        System.out.println("refactoriing");
        System.out.println(refactoring.toXml());

        System.out.println("math: ");
        System.out.println(math.toXml());
    }
}
