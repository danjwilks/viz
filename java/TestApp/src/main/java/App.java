public class App implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        App a = new App();
        a.run();
    }
}
