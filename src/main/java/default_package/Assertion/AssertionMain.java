package default_package.Assertion;

import java.util.Random;

public class AssertionMain {

    private static final Random random = new Random(1234);

    private static void execute(int length){
        int[] data = new int[length];
        for(int i=0;i<data.length;i++){
            data[i] = random.nextInt(data.length);
        }
        SortSample sortSample = new SortSample(data);
        System.out.println("BEFORE: " + sortSample);

        sortSample.sort();;
        System.out.println("AFTER: " + sortSample);

        System.out.println();

    }


    public void run(){
        execute(10);
        execute(10);
        execute(10);
        execute(10);
        execute(10);
        execute(10);


    }


}
