package defalut_package;

import defalut_package.magic_number.MagicNumberMain;
import defalut_package.remove_control_flag.RemoveControlFlagMain;

public class Main {
    public static void main(String args[]){
        MagicNumberMain magicNumberMain = new MagicNumberMain();
        RemoveControlFlagMain removeControlFlagMain = new RemoveControlFlagMain();

        System.out.println("===========================================[Chapter] - Replace magic number with symbolic constant ===========================================");
        magicNumberMain.run();
        System.out.println("===========================================[Chapter] - Remove control flag ===========================================");
        removeControlFlagMain.run();
    }
}
