package restaurant;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem cheeseburger = new MenuItem("The Big Cheese", 4.99, "Nice big juicy cheeseburger", "Sandwiches", false);
        MenuItem chiliCheeseFries = new MenuItem("Loaded Fries", 3.59, "Fries covered in chili and cheese", "Sides", false);
        MenuItem fountainSoda = new MenuItem("Fountain Soda", 1.79, "Refreshing fountain soda", "Drinks", false);

        Menu myMenu = new Menu();
        myMenu.add(cheeseburger);
        myMenu.add(chiliCheeseFries);
        myMenu.add(fountainSoda);
        System.out.println(myMenu);
        System.out.println(fountainSoda);
        myMenu.remove(cheeseburger);
        System.out.println(myMenu);
    }
}
