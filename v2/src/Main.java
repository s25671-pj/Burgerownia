public class Main {
    public static void main(String[] args) {

        Order meal = new Order();
        meal.orderInfo();

        Order meal2 = new Order(new Burger("double"), new Drink("still", "m"), new SideItem("onion"));
        meal2.burger.toppings("tomato", "gouda", "patty");
        meal2.orderInfo();

        Order meal3 = new Order(new Burger("deluxe"), new Drink("tonic", "l"), new SideItem("nuggets"));
        meal3.burger.toppings("patty", "olives", "lettuce", "bacon", "cheddar");
        meal3.orderInfo();

        Order meal4 = new Order(new Burger("veggie"), new Drink("forest fruit", "l"), new SideItem("sweet potato fries"));
        meal4.burger.toppings("chicken","onion","potato");
        meal4.orderInfo();
    }
}