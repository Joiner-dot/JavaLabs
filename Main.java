package ru.billing.client;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import  ru.billing.stocklist.FoodItem;
import  ru.billing.stocklist.GenericItem;
import  ru.billing.stocklist.TechnicalItem;
import  ru.billing.stocklist.ItemCatalog;
import  ru.billing.stocklist.Category;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.Date;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws CloneNotSupportedException, ItemAlreadyExistsException, CatalogLoadException {
        FoodItem item10 = new FoodItem("Cereal");

        String line = "Конфеты 'Маска';45;120";
        String[] item_fld = new String[3];
        item_fld = line.split(";");
        FoodItem item11 = new FoodItem(item_fld[0], Float.valueOf(item_fld[1]), Short.valueOf(item_fld[2]));


        GenericItem itemThree = new GenericItem(3, "copybook", 48.0F, "copybook");
        Date date1 = new Date(2020, 2, 16);
        Date date2 = new Date(2020, 2, 16);
        FoodItem itemFour = new FoodItem(4, "apple", 5.0F, "fruit", date1, (short)10);
        itemFour.categ = Category.FOOD;
        FoodItem itemFive = new FoodItem(5, "watermellon", 60.0F, "vegetable", date2, (short)15);
        itemFive.categ = Category.FOOD;

        ItemCatalog cat1 = new ItemCatalog();
        cat1.addItem(itemFour);
        cat1.addItem(itemThree);
        cat1.addItem(itemFive);
        cat1.addItem(item11);
        cat1.addItem(item10);

        //сравниваем, какой метод поиска работает быстрее
        long begin = new Date().getTime();

        for(int i = 0; i < 100000; i++)
            cat1.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end-begin)); begin = new Date().getTime();
        for(int i = 0; i < 100000; i++)
            cat1.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end-begin));

        CatalogLoader loader = new CatalogStubLoader();
        cat1.printItems(); //выводим содержимое каталога


    }
}
