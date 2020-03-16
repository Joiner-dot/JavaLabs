package sync;

public class U1901Bank {
    int intTo = 0;
    int intFrom = 220;

    synchronized void calc(int intTransaction, long lngTimeout) {
        System.out.println("Before " + Thread.currentThread().getName() + ", to " + intTo + ", from " + intFrom);
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (Exception e)
        {
            System.out.print(e);
        }

        intTo += intTransaction;
        System.out.println("After " + Thread.currentThread().getName() + ", to " + intTo + ", from " + intFrom);


    }
}
