package ru.itmo.client; //package
import ru.billing.client.CatalogLoader;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
//1)	Добавьте в пакет ru.itmo.client новый класс CatalogFileLoader,
// реализующий интерфейс CatalogLoader.
class CatalogFileLoader implements CatalogLoader {
    //строковое поле, содержащее имя файла со списком товаров и конструктор,
    // принимающий на вход имя этого файла:
    private String fileName;
    public CatalogFileLoader(String fileName) {
        this.fileName = fileName;
    }
    public void load(ItemCatalog cat) throws CatalogLoadException {
        File f = new File(fileName);
        FileInputStream fis;
        String line;
        try {
            fis = new FileInputStream(f);
            Scanner s = new Scanner(fis);

            while(s.hasNextLine()){
                line = s.nextLine();
                if(line.length()==0) break;
                String[] item_fld = line.split(";");
                String name = item_fld[0];
                float price = Float.parseFloat(item_fld[1]);
                short expires = Short.parseShort(item_fld[2]);
                FoodItem item = new FoodItem(name, price, null, new Date(), expires);
                cat.addItem(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new CatalogLoadException();
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException();
        }
        try {
            fis.close(); //закрываем файл
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}



