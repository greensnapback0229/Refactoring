package default_package.remove_control_flag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabaseRefactor1 {
    private Map<String, String> _map = new HashMap<String, String>();


    public SimpleDatabaseRefactor1(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);

        String line;

        while(true){
            line = reader.readLine();
            if(line == null)
                break;
            else{
                boolean scanningKey = true;
                StringBuffer keyBuffer = new StringBuffer();
                StringBuffer valueBuffer = new StringBuffer();

                for(int i=0;i<line.length();i++){
                    char c = line.charAt(i);
                    int equalIndex = line.indexOf("=");
                    if(line == null){
                        break;
                    }
                    if(equalIndex > 0){
                        String key = line.substring(0, equalIndex);
                        String value = line.substring(equalIndex + 1, line.length());
                    }
                }
                String ss1 = keyBuffer.toString();
                String ss2 = valueBuffer.toString();
                _map.put(ss1, ss2);
            }
        }
    }

    public void putValue(String key, String value){
        _map.put(key, value);
    }

    public String getValue(String key){
        return _map.get(key);
    }
    public Iterator<String> iterator(){
        return _map.keySet().iterator();
    }
}
