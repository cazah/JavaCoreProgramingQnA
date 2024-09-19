public class SampleRunnable implements Runnable{
    public static void main(String[] args) {
        SampleRunnable runnable = new SampleRunnable();
        runnable.run();
    }

    @Override
    public void run() {
        System.out.println("Hello");
    }
}
