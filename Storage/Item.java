package DZ_OOP_01_Store.Storage;

import DZ_OOP_01_Store.Enum.Category;

public class Item {
    private Category category;
    private String nameOfItem;
    private double cost;


    public Item(String nameOfItem, double cost, Category category) {
        this.nameOfItem = nameOfItem;
        this.cost = cost;
        this.category = category;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
