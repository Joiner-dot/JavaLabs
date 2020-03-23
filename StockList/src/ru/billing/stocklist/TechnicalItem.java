package ru.billing.stocklist;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class TechnicalItem extends GenericItem implements Cloneable {
    private short warrantyTime;


    public short getWarT(){
        return warrantyTime;
    }

    public void setDate(short a){
        this.warrantyTime = a;
    }

    public TechnicalItem(int ID, String name, float price, String type, short warrantyTime) {
        super(ID, name, price, type);
        this.warrantyTime = warrantyTime;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , ru.billing.stocklist.Category: %-20s , warranty time: %d \n", this.getID(), this.getName(), this.getPrice(), this.categ, this.warrantyTime);
    }

@Override
    public boolean equals(Object o) {
        boolean res = false;
        if (o instanceof TechnicalItem) {
            TechnicalItem item = (TechnicalItem)o;
            if (super.equals(o) && this.warrantyTime == item.warrantyTime) {
                res = true;
            }
        }

        return res;
    }
    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + warrantyTime;
        return result;
    }

    public String toString() {
        String str = "ID: " + this.getID()+ ", Name: " + this.getName() + ", price: " + this.getPrice() + ", type: " + this.getType() + ", category: " + this.categ + ", warranty time: " + this.warrantyTime;
        return str;
    }
}
