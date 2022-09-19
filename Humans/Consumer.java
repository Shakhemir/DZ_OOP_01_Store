package DZ_OOP_01_Store.Humans;

import DZ_OOP_01_Store.Storage.Item;

import java.util.ArrayList;

public class Consumer extends Human{
    private ArrayList<Item> wishList = new ArrayList<>();

    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public void setWishList(ArrayList<Item> wishList) {
        this.wishList = wishList;
    }

    public ArrayList<Item> getWishList() {
        return wishList;
    }

    @Override
    public double totalCost() {
        double total = 0;
        for (Item item: wishList) {
            total += item.getCost();
        };
        return total;
    }

    @Override
    public boolean areYouPoor() {
        if(totalCost() > this.getMoney()){
            System.out.println("Ты нищеброд");
            return true;
        } else {
            walkInStorage();
            return false;
        }
    }

    @Override
    public void walkInStorage() {
        System.out.println("Покупатель пошел на склад");
    }
}
