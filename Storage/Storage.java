package DZ_OOP_01_Store.Storage;

import DZ_OOP_01_Store.Humans.Seller;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<ItemStorage> items = new ArrayList<>();
    private List<Seller> sellers = new ArrayList<>();

    public List<ItemStorage> getItems() {
        return items;
    }

    public void setItems(List<ItemStorage> items) {
        this.items = items;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }
}
