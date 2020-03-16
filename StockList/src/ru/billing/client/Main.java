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
        //System.out.println("\n" + item10.toString());

        String line = "Конфеты 'Маска';45;120";
        String[] item_fld = new String[3];
        item_fld = line.split(";");
        FoodItem item11 = new FoodItem(item_fld[0], Float.valueOf(item_fld[1]), Short.valueOf(item_fld[2]));
        //System.out.println(item11.toString());


        GenericItem itemOne = new GenericItem(1, "notebook", 35.0F, "copybook");
        itemOne.categ = Category.PRINT;
        //itemOne.printAll();
        GenericItem itemTwo = new GenericItem(2, "pen", 25.0F, "pen");
        itemTwo.categ = Category.PRINT;
        //itemTwo.printAll();
        GenericItem itemThree = new GenericItem(3, "copybook", 48.0F, "copybook");
        itemThree.categ = Category.PRINT;
        //itemThree.printAll();
        Date date1 = new Date(2020, 2, 16);
        Date date2 = new Date(2020, 2, 16);
        FoodItem itemFour = new FoodItem(4, "apple", 5.0F, "fruit", date1, (short)10);
        itemFour.categ = Category.FOOD;
        FoodItem itemFive = new FoodItem(5, "watermellon", 60.0F, "vegetable", date2, (short)15);
        itemFive.categ = Category.FOOD;
        TechnicalItem itemSix = new TechnicalItem(6, "TV", 20000.0F, "TV", (short)100);
        TechnicalItem itemSeven = new TechnicalItem(7, "IPhone", 40000.0F, "phone", (short)150);
        GenericItem[] items = new GenericItem[]{itemFour, itemFive, itemSix, itemSeven};

        //for(int i = 0; i < items.length; ++i) {
          //  items[i].printAll();
        //}

        //System.out.printf("Items are equal: " + itemFour.equals(itemFive) + "\n");
        FoodItem itemEight = new FoodItem(8, "banana", 8.0F, "fruit", date1, (short)5);
        FoodItem clone = (FoodItem)itemEight.clone();
        //System.out.printf(itemEight.toString() + "\n");
        //System.out.printf(clone.toString() + "\n");
        //System.out.printf("Items are equal: " + itemEight.equals(clone));

        ItemCatalog cat1 = new ItemCatalog();
        cat1.addItem(itemFour);
        cat1.addItem(itemThree);
        cat1.addItem(itemFive);
        cat1.addItem(item11);
        cat1.addItem(item10);

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
        loader.load(cat1);
        //cat1.addItem(item11);
        cat1.printItems();


    }
}
