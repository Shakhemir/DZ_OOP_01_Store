package DZ_OOP_01_Store.Interfaces;

import DZ_OOP_01_Store.Storage.Item;
import DZ_OOP_01_Store.Humans.Seller;

import java.util.List;

public interface Communication {

    default double costOfItem(Item item) {
        return item.getCost();
    }

    default boolean isItemsInStorage(Seller seller, List<Item> wishListOfConsumer) {
        boolean result = true;
        for (Item item : wishListOfConsumer) {
            if (!seller.getItems().contains(item)) {
                System.out.println("У нас нет " + item.getNameOfItem());
                result = false;
            }
        }
        return result;
    }

    //Дописать метод
    double totalCost();

    boolean areYouPoor();


    //У Покупателя и Продавца реализовать свои вариации метода "пойти на склад"
    void walkInStorage();
}
