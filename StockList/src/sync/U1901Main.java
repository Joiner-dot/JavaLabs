package sync;

public class U1901Main {
    public static void main(String[] args) {
        var bankMain = new U1901Bank();
        var threadOne = new U1901Thread(bankMain, 100, 2000);
        threadOne.setName("FirstThread");
        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadOne.start();

        var threadTwo = new U1901Thread(bankMain, 50, 300);
        threadTwo.setName("SecondThread");
        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();

        System.out.println(Thread.currentThread().getName());

    }
}
