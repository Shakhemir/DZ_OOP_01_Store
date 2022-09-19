package DZ_OOP_01_Store.Storage;

import DZ_OOP_01_Store.Enum.Category;
import DZ_OOP_01_Store.Interfaces.Amount;

public class ItemStorage extends Item implements Amount {
    private double amount;

    public ItemStorage(String nameOfItem, double cost, Category category, double amount) {
        super(nameOfItem, cost, category);
        this.amount = amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
