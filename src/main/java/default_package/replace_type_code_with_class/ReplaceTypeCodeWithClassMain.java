package default_package.replace_type_code_with_class;

public class ReplaceTypeCodeWithClassMain {
    public void run(){
        Item book = new Item(
                Item.TYPECODE_BOOK,
                "세계 역사",
                4800
        );

        Item dvd = new Item(
                Item.TYPECODE_DVD,
                "뉴욕의 꿈 특별판",
                3000
        );

        Item soft = new Item(
                Item.TYPECODE_SOFTWARE,
                "튜링 머신 에뮬레이터",
                3200
        );

        System.out.println("book = " + book.toString());
        System.out.println("dvd = " + dvd.toString());
        System.out.println("soft = " + soft.toString());
    }
}
