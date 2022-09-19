package DZ_OOP_01_Store;

import DZ_OOP_01_Store.Humans.Consumer;
import DZ_OOP_01_Store.Interfaces.Communication;

public class Main {
    public static void main(String[] args) {
        Communication com = new Consumer("Робот", 500, 5);
        System.out.println(((Consumer)com).getName());
        System.out.println(com.totalCost());
        System.out.println(com.areYouPoor());
    }
}
