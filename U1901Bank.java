package sync;

public class U1901Bank {
    int intTo = 0;
    int intFrom = 220;
//В этом методе будет организована
//банковская операция по переброске денег
//между счетами (между переменными intFrom и
//intTo). Между снятием денег с одного счета
//(уменьшением значения переменной intFrom)
//и пополнением другого счета (увеличением
//переменной intTo) будет организована задержка.
//длительность которой передается в качестве
//входного параметра. Также в качестве входного
//параметра передается сумма
// перевода между счетами.
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
