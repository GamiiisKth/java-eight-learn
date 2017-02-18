package chapter3.localVariable;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

// read the code and see the png picture
public class LocalVariable {

    // this is a instance variable
    // private int portNumber

    public static void main(String[] args) {
        /**
         * a local variable which will be assign to lambda should
         * be declared as final or effectively final
         *
         * int port=1000
         */

        // this is a local variable
        int port = 1000;

        Runnable runnable = () -> System.out.println(port);

        // if we remove the comment it will case a error that the port should be final
        // because the value of variable which has been uses in the lambda can't be changed

        //  Port = 2000;

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
