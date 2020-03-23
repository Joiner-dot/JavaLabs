package ru.billing.stocklist;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Date;

public class FoodItem extends GenericItem implements Cloneable {
    private Date dateOfIncome;
    private short expires;

    public short getExp(){
        return expires;
    }

    public void setExp(short a){
        this.expires = a;
    }

    public Date getDate(){
        return dateOfIncome;
    }

    public void setDate(Date a){
        this.dateOfIncome = a;
    }



    public FoodItem(int ID, String name, float price, String type, Date dateOfIncome, short expires) {
        super(ID, name, price, type);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, String type, Date date, short expires) {
        super(name, price, type);
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        super(name, price, "Unknown");
        this.expires = expires;
    }

    public FoodItem(String name) {
        super();
        this.setName(name);
    }

    @Override
    public boolean equals(Object o) {
        boolean res = false;
        if (o instanceof FoodItem) {
            FoodItem item = (FoodItem)o;
            if (super.equals(o) && this.dateOfIncome == item.dateOfIncome && this.expires == item.expires) {
                res = true;
            }
        }

        return res;
    }
    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + expires;
        result = prime * result + dateOfIncome.hashCode();
        return result;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , ru.billing.stocklist.Category: %-20s , expires: %d , ", this.getID(), this.getName(), this.getPrice(), this.categ, this.expires);
        System.out.printf("Date of income: " + this.dateOfIncome.toString() + "\n");
    }

    public String toString() {
        String str = "ID: " + this.getID() + ", Name: " + this.getName() + ", price: " + this.getPrice() + ", type: " + this.getType() + ", category: " + this.categ + ", expires: " + this.expires + ", ";
        str = str + "date of income: " + this.dateOfIncome;
        return str;
    }
}
