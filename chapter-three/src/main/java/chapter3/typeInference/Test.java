package chapter3.typeInference;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Test {

    private static Boolean boolea=false;


    public static void setBoolea(Boolean boolea) {
        Test.boolea = boolea;
    }

    public static void main(String[] args) {

        Runnable runnable=()->{
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(4000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBoolea(true);
        };

        Thread thread = new Thread(runnable);
        thread.start();


        while (!boolea){
            System.out.println(boolea);
            try {
                Thread.sleep(3000L);
                System.out.println(Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(boolea);
        }
    }
}
