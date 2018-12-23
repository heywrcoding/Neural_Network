package NeuralNet.Utils;

public class myUtils {
    public static void caveTest(Object o) {
        System.out.println("Test print " + o.getClass().getSimpleName() + " : " + o);
    }

    public static void caveTest(String string, Object o) {
        System.out.println("Test print " + string + " : " + o);
    }

    public static void caveTest(String string, Object o, boolean ifPrint) {
        if (ifPrint)
            System.out.println("Test print " + string + " : " + o);
    }


}
