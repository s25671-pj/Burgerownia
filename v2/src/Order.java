import java.text.DecimalFormat;

public class Order {

    public Burger burger;
    public Drink drink;
    public SideItem sideItem;

    public Order() {
        this.burger = new Burger("ham");
        this.drink = new Drink("coke", "s");
        this.sideItem = new SideItem("fries");
    }

    public Order(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void orderInfo() {
        if (burger.getType().equals("Deluxe Burger")) {
            System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\n" +
                    "################################\n" +
                    "««««««««««««««««««««««««««««««««\nORDER DETAILS:\n\n" +
                    burger.burgerSpec() +
                    drink.getDrinkInfo() +
                    sideItem.getSideItemInfo() +
                    "________________________________\n»»» DELUXE BURGER DISCOUNT APPLIED «««\nTOTAL:\n" +
                    calculateBill());
        } else {
            System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\n" +
                    "################################\n" +
                    "««««««««««««««««««««««««««««««««\nORDER DETAILS:\n\n" +
                    burger.burgerSpec() +
                    drink.getDrinkInfo() +
                    sideItem.getSideItemInfo() +
                    "________________________________\nTOTAL:\n" +
                    calculateBill());
        }
    }

    public double calculateBill() {
        double bill;
        if (burger.getChosenToppings() == null) {
            bill = burger.getBurgerPrice() +
                    drink.getDrinkPrice() +
                    sideItem.getSideItemPrice();
        } else if (burger.getType().equals("Deluxe Burger")) {
            bill = burger.getBurgerPrice();
        } else {
            bill = burger.getBurgerPriceWithToppings() +
                    drink.getDrinkPrice() +
                    sideItem.getSideItemPrice();
        }
        return Math.round(bill * 100.0) / 100.0;
    }
}