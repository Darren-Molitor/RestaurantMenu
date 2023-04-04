package org.example;

import restaurant.Menu;
import restaurant.MenuItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuList = new ArrayList<>();
        Menu italian = new Menu("Molitori");
        MenuItem meatLovers = new MenuItem("Pizza","Entre    ", "Pepperoni, Sausage, & Bacon with Mozzarella on a Thin crust",
                15.99, false);
        MenuItem pasta = new MenuItem("Fetteccini","Entre    ", "Fetteccini Pasta with Garlic Provolone Cream Sauce",
                12.99, true);
        MenuItem primeRib = new MenuItem("PrimeRib","Entre    ","16 oz Angus Prime Rib Steak",
                21.99, true);
        MenuItem ravioli = new MenuItem("Ravioli","Appetizer","Beef & Spinach Toasted Ravioli",
                8.99, true);
        MenuItem bread = new MenuItem("GarlicBread","Appetizer", "Mozzarella Garlic Bread",
                2.99, false);
        MenuItem cake = new MenuItem("GooeyButter","Desert   ", "Homemade Gooey Butter Cake 800cal/slice",
                3.99, true);
        MenuItem spamoni = new MenuItem("Spamoni","Desert   ","Mint Spamoni Ice Cream",
                3.99, false);
        MenuItem salad = new MenuItem("Salad","Salad    ", "Romane Lettuce, Tomato, Black Olive, Green Pepper",
                5.99, false);
        MenuItem wine = new MenuItem("Wine","Drink    ", "Red Wine or White Wine: List Available",
                7.99, false);
        MenuItem soda = new MenuItem("Soda","Drink    ", "Pepsi, Coke, 7Up, Dr.Pepper, Rootbeer, Diets",
                2.99, true);
        MenuItem beer = new MenuItem("Beer","Drink    ", "Draft & Bottle: List Available",
                4.99, false);

        menuList.add(meatLovers);
        menuList.add(pasta);
        menuList.add(primeRib);
        menuList.add(cake);
        menuList.add(spamoni);
        menuList.add(ravioli);
        menuList.add(bread);
        menuList.add(salad);
        menuList.add(wine);
        menuList.add(soda);
        menuList.add(beer);

        String rest = italian.getName();
        String updated = italian.getLastUpdated();
        System.out.println();
        System.out.println(rest + "     " + "Last Updated: " + updated);
        System.out.println("Item\tCategory\tDescription\tPrice");
        String skip = "skip";

        for (MenuItem food : menuList) {
            String cat = food.getCategory();
            String desc = food.getDescription();
            Double prc = food.getPrice();
            String layout = (cat + "  " + desc +"   $"+ prc);

            if (skip != cat) {
                System.out.println();
                skip = cat;
            }

            System.out.println(layout);
        }
    }
}
