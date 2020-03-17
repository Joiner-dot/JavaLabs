package sync;
//3)	Создайте класс-наследник от Thread с
// именем U1901Thread, в котором будем
// реализовывать многопоточность для работы
// с методом calc класса U1901Bank.
public class U1901Thread extends Thread {
    U1901Bank bankWork;
    int intTrans;
    long lngSleep;

    public U1901Thread(U1901Bank bank, int intT, long lngS) {
        this.bankWork = bank;
        this.intTrans = intT;
        this.lngSleep = lngS;
    }

    public void run() {
        bankWork.calc(this.intTrans, this.lngSleep);
    }
}
