package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemCatalog {
    private Map<Integer, GenericItem> catalog =
            new HashMap<Integer,GenericItem>();
    private List<GenericItem> ALCatalog =
            new ArrayList<GenericItem>(); //видимо , так, хотя так было прямо в задании написано, понято-принято
    //Обе эти коллекции будут хранить один и тот
    //же список товаров. Коллекция HashMap более
    // оптимальна для последующего поиска товаров
    // в каталоге, а коллекция ArrayList нужна для
    // сравнения с ней.

    public void addItem(GenericItem item) throws ItemAlreadyExistsException{
        //ошибка, если такой товар уже есть в каталоге
        if (this.catalog.containsKey(item.getID()) || this.ALCatalog.contains(item)) {
            throw new ItemAlreadyExistsException();
        }
        
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }
    //вывод содержания каталога

    public void printItems(){
        for(GenericItem i : ALCatalog){
            System.out.println(i);
        }
    }
    //производит поиск в каталоге по переданному
    // id товара. Поиск следует производит в
    // коллекции catalog типа HashMap

    public GenericItem findItemByID(int id){
//Если нет такого ID, возвращаем пустое значение
        if(!catalog.containsKey(id)) {
            return null;
        } else{
            return catalog.get(id);
        }
    }
    //производит поиск в каталоге по переданному
    // id товара. Поиск следует производит
    // в коллекции ALCatalog типа ArrayList

    public GenericItem findItemByIDAL(int id){
        for(GenericItem i : ALCatalog){
            if(i.getID()==id) return i;
        }
        return null;
    }





}






}
