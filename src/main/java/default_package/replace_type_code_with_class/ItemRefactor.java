package default_package.replace_type_code_with_class;

public class ItemRefactor {
    public static final int TYPECODE_BOOK = ItemType.BOOK.getTypecode();
    public static final int TYPECODE_DVD = ItemType.DVD.getTypecode();
    public static final int TYPECODE_SOFTWARE = ItemType.SOFT.getTypecode();

    private final int _typecode;
    private final String _title;
    private final int _price;

    public ItemRefactor(int typecode, String title, int price){
        _typecode = typecode;
        _title = title;
        _price = price;
    }

    public int getTypecode(){
        return _typecode;
    }

    public String getTitle(){
        return _title;
    }

    public int getPrice(){
        return _price;
    }

    public String toString(){
        return "[ "
                + getTypecode() + ", "
                + getTitle() + ", "
                + getPrice() + " ]";
    }
}
