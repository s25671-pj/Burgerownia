public class Burger {

    private String type;
    private double burgerPrice;
    private double burgerPriceWithToppings;
    private String toppingSort;
    private String chosenToppings;
    private double toppingsPrice;

    public Burger(String type) {

        switch (type.toLowerCase()) {
            case "deluxe", "deluxeburger", "deluxe burger" -> setType("Deluxe Burger");
            case "cheese", "cheeseburger" -> setType("Cheeseburger");
            case "regular", "regular burger", "regularburger", "ham", "hamburger" -> setType("Hamburger");
            case "chicken", "chickenburger", "chicken burger" -> setType("Chicken Burger");
            case "double", "doubleburger", "double burger" -> setType("Double Burger");
            case "veggie", "veggieburger", "veggie burger", "vegetarian burger", "vegetarianburger", "vegetarian" ->
                    setType("Vegetarian burger");
            default -> setType("None");
        }
        switch (getType()) {
            case "Deluxe Burger" -> setBurgerPrice(77);
            case "Cheeseburger" -> setBurgerPrice(32);
            case "Hamburger" -> setBurgerPrice(30);
            case "Chicken Burger" -> setBurgerPrice(31);
            case "Double Burger" -> setBurgerPrice(34);
            case "Vegetarian burger" -> setBurgerPrice(35);
            default -> setBurgerPrice(0);
        }
    }

    // Metody do dodawania 1-3 dodatkow do Regular Burgera, 1-5 do Deluxe Burgera
    public double toppings(String toppingType1) {

        if (getType().equals("None")) {
            System.out.println("Can't add toppings without a burger.");
            setBurgerPrice(0);
            return getBurgerPrice();
        } else {
            switch (toppingType1.toLowerCase()) {
                case "meat", "salami", "ham", "bacon", "beef", "chicken", "burger patty", "patty" -> {
                    setToppingsPrice(5);
                    setToppingSort("Meat");
                }
                case "cheese", "melted cheese", "blue cheese", "gouda", "cheddar", "mozzarella", "halloumi" -> {
                    setToppingsPrice(4.5);
                    setToppingSort("Cheese");
                }
                case "vegetables", "tomato", "onion", "pickles", "olives", "lettuce", "pepper" -> {
                    setToppingsPrice(4.2);
                    setToppingSort("Vegetable");
                }
                default -> setToppingsPrice(6.7);
            }
            if (chosenToppings == null) {
                chosenToppings = " · Toppings: \n";
            }
            setChosenToppings(getChosenToppings() + " · · " + getToppingSort() + " (" + toppingType1 + ")\n · · · price: " + getToppingsPrice() + "\n");
            setBurgerPriceWithToppings(getBurgerPrice() + getToppingsPrice());

        }
        return getBurgerPriceWithToppings();
    }

    public double toppings(String toppingType1, String toppingType2) {
        setBurgerPriceWithToppings(-getBurgerPrice() + toppings(toppingType1) + toppings(toppingType2));
        return getBurgerPriceWithToppings();
    }

    public double toppings(String toppingType1, String toppingType2, String toppingType3) {
        setBurgerPriceWithToppings((-getBurgerPrice() * 2) + toppings(toppingType1) + toppings(toppingType2) + toppings(toppingType3));
        return getBurgerPriceWithToppings();
    }

    public double toppings(String toppingType1, String toppingType2, String toppingType3, String toppingType4) {
        if ("Deluxe Burger".equals(getType())) {
            setBurgerPriceWithToppings(toppings(toppingType1) + toppings(toppingType2) + toppings(toppingType3) + toppings(toppingType4));
            return getBurgerPriceWithToppings();
        }
        System.out.println("Regular Burger can not have more than 3 toppings.");
        burgerPrice = Double.NaN;
        return burgerPrice;
    }

    public double toppings(String toppingType1, String toppingType2, String toppingType3, String toppingType4, String toppingType5) {
        if ("Deluxe Burger".equals(getType())) {
            setBurgerPriceWithToppings(toppings(toppingType1) + toppings(toppingType2) + toppings(toppingType3) + toppings(toppingType4) + toppings(toppingType5));
            return getBurgerPriceWithToppings();
        }
        System.out.println("Regular Burger can not have more than 3 toppings.");
        burgerPrice = Double.NaN;
        return burgerPrice;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChosenToppings() {
        return chosenToppings;
    }

    public void setChosenToppings(String chosenToppings) {
        this.chosenToppings = chosenToppings;
    }

    public double getBurgerPriceWithToppings() {
        return burgerPriceWithToppings;
    }

    public void setBurgerPriceWithToppings(double burgerPriceWithToppings) {
        this.burgerPriceWithToppings = burgerPriceWithToppings;
    }

    public String getToppingSort() {
        return toppingSort;
    }

    public void setToppingSort(String toppingSort) {
        this.toppingSort = toppingSort;
    }

    public String burgerSpec() {
        if (getChosenToppings() == null) {
            return "Burger: \n" + " · · " + getType() + "\n · · · price: " + getBurgerPrice() + "\n\n";
        } else {
            return "Burger: \n" + " · · " + getType() + "\n · · · price: " + getBurgerPrice() + "\n" + getChosenToppings() + "\n";
        }
    }

    public double getToppingsPrice() {
        return toppingsPrice;
    }

    public void setToppingsPrice(double toppingsPrice) {
        this.toppingsPrice = toppingsPrice;
    }
}