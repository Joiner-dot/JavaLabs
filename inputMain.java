import java.io.*;
public class inputMain {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\yanko\\Documents\\Study\\Programming\\Java\\StockList\\file.txt";
        String code1 = "WINDOWS-1251";
        String code2 = "UTF-8";

        var input = new InputCod();
        System.out.println(input.Input("C:\\Users\\yanko\\Documents\\Study\\Programming\\Java\\StockList\\file.txt", code2));

}
}
