package defalut_package.remove_control_flag;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class RemoveControlFlagMain {
    public void run(){
        int[] data = {
                1,9,0,2,8,5,6,3,4,7
        };

        if(FindIntRefactor2.find(data,5)){
            System.out.println("Found!");
        }

        else{
            System.out.println("Not found");
        }

        try{
            SimpleDatabase db = new SimpleDatabase((new FileReader("dbfile.txt")));
            Iterator<String> it = db.iterator();

            while(it.hasNext()){
                String key = it.next();
                System.out.println("KEY:\"" + key + "\"");
                System.out.println("VALUE:\""+db.getValue(key) + "\"");
                System.out.println();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
