package default_package.Assertion;

public class SortSample {
    private final int[] _data;

    public SortSample(int[] data){
        _data = new int[data.length];
        System.arraycopy(data, 0, _data, 0, data.length);

    }

    public void sort(){
        for(int x=0;x<_data.length-1;x++){
            int least = x;
            for(int y=x+1;y< _data.length-1;y++){
                if(_data[least] > _data[y]){
                    least = y;
                }
            }
            //_data[y] must be a minimum number
            int v = _data[least];
            _data[x] = v;
            //from index 0 to x must be sorted
        }
    }

    public String toString(){
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        for(int i =0;i<_data.length;i++){
            buffer.append(_data[i]);
            buffer.append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }
}