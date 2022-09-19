package DZ_OOP_01_Store.Humans;

import DZ_OOP_01_Store.Storage.Item;

import java.util.ArrayList;
import java.util.List;

public class Seller extends Human{
    private List<Item> items = new ArrayList<>();

    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public double totalCost() {
        double total = 0;
        for (Item item: items) {
            total += item.getCost();
        };
        return total;
    }

    @Override
    public boolean areYouPoor() {
        if (items.isEmpty()) return true;
        return false;
    }

    @Override
    public void walkInStorage() {
        System.out.println("Продавец пошел на склад");
    }
}
