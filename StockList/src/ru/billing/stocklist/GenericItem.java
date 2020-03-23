package ru.billing.stocklist;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class GenericItem implements Cloneable {
    private int ID;
    static int currentID = 1;
    private String name;
    private float price;
    private String type;
    public Category categ = Category.GENERAL;


    public int getID(){
        return ID;
    }

    public void setID(int a){
        this.ID = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String a){
        this.name = a;
    }

    public String getType(){
        return type;
    }

    public void setType(String a){
        this.type = a;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float a){
        this.price = a;
    }

    public GenericItem(int ID, String name, float price, String type) {
        this.ID = ID;
        if (ID > currentID) {
            currentID = ID;
        }
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public GenericItem(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.categ = category;
        this.ID = GenericItem.currentID++;
        this.type = "Unknown";
    }

    public GenericItem(String name, float price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem() {
        //
        this("Unkown", 0.f, "Unkown");

    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , ru.billing.stocklist.Category: %-20s \n", this.ID, this.name, this.price, this.categ);
    }

 @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        result = prime * result + name.hashCode();
        result = prime * result + (String.valueOf(price)).hashCode();
        result = prime * result + type.hashCode();
        result = prime * result + categ.hashCode();
        return result;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        String str = "ID: " + this.ID + ", Name: " + this.name + ", price: " + this.price + ", type: " + this.type + ", category: " + this.categ ;
        return str;
    }
}
