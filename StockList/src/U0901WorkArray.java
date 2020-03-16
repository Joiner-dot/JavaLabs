public class U0901WorkArray<T extends Number>  {
    T[] arrNums;

    public U0901WorkArray(T[] numP) {
        arrNums = numP;
    }

    public double sum() {
        double doubleWork = 0;
        for(int i = 0; i < arrNums.length; i++) {
            double num = (double) this.arrNums[i].doubleValue();
            doubleWork += num;
        }
        return doubleWork;
    }


}
