package default_package;

import default_package.Assertion.AssertionMain;
import default_package.extract_class.ExtractClassMain;
import default_package.magic_number.MagicNumberMain;
import default_package.null_object.NullObjectMain;
import default_package.remove_control_flag.RemoveControlFlagMain;
import default_package.replace_type_code_with_class.ReplaceTypeCodeWithClassMain;

public class Main {
    public static void main(String args[]){
        MagicNumberMain magicNumberMain = new MagicNumberMain();
        RemoveControlFlagMain removeControlFlagMain = new RemoveControlFlagMain();
        AssertionMain assertionMain = new AssertionMain();
        NullObjectMain nullObjectMain = new NullObjectMain();
        ExtractClassMain extractClassMain = new ExtractClassMain();
        ReplaceTypeCodeWithClassMain replaceTypeCodeWithClassMain = new ReplaceTypeCodeWithClassMain();

        //Chap1
        displayChapter("Replace magic number with symbolic constant", 1);
        magicNumberMain.run();

        //Chap02
        displayChapter("Remove control flag", 2);
        removeControlFlagMain.run();

        //Chap03
        displayChapter("Assertion", 3);
        assertionMain.run();

        //Chap04
        displayChapter("Null Object", 4);
        nullObjectMain.run();

        //chap06
        displayChapter("Extract Class", 6);
        extractClassMain.run();

    }

    public static void displayChapter(String chapterName, int chapterNum){
        StringBuilder display = new StringBuilder();
        display.append( String.format(" [Chapter%2d] %s ", chapterNum, chapterName));

        int equalSymbolCount;
        if(display.length() % 2 == 1){
            display.append(" ");
            equalSymbolCount = (140 - display.length())/2;
        }
        else{
            equalSymbolCount = (140 - display.length())/2;
        }

        for(int i=0;i<equalSymbolCount;i++){
            display.insert(0, "=");
            display.append("=");
        }

        System.out.println(display.toString());
    }

}
