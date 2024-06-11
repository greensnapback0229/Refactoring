package default_package.replace_type_code_with_class;

public enum ItemTypeEnum {
    BOOK(0),
    DVD(1),
    SOFT(2);

    private final int _typecode;
    private ItemTypeEnum(int typecode){
        _typecode = typecode;
    }

    public int getTypecode(){
        return _typecode;
    }
}