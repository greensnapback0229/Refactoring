package defalut_package.remove_control_flag;

public class FindIntRefactor1 {
    public static boolean find(int[] data, int target){
        boolean found = false;
        for(int i=0;i<data.length && !found;i++){
            if(data[i] == target){
                found = true;
                break;
            }
        }
        return found;
    }
}
