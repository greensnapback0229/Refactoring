package default_package.replace_type_code_with_class;

public class Item {
    public static final ItemTypeEnum TYPECODE_BOOK = ItemTypeEnum.BOOK;
    public static final ItemTypeEnum TYPECODE_DVD = ItemTypeEnum.DVD;
    public static final ItemTypeEnum TYPECODE_SOFTWARE = ItemTypeEnum.SOFT;

    private final ItemTypeEnum _itemType;
    private final String _title;
    private final int _price;

    public Item (ItemTypeEnum itemTypeEnum, String title, int price){
        _itemType = itemTypeEnum;
        _title = title;
        _price = price;
    }

    public int getTypecode(){
        return _itemType.getTypecode();
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
