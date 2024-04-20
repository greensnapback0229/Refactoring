package defalut_package.remove_control_flag;

public class FindIntRefactor2 {
    public static boolean find(int[] data, int target){
        for(int i=0;i<data.length;i++){
            if(data[i] == target){
                return true;
            }
        }
        return false;
    }
}
