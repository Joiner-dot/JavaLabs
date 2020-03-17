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
     
        GenericItem itemThree = new GenericItem(3, "copybook", 48.0F, "copybook");
        itemThree.categ = Category.PRINT;
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
        cat1.addItem(item10);

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(cat1);
        //cat1.addItem(item11); провоцировали ошибку
        cat1.printItems();


    }
}
