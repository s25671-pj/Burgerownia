public class Drink {

    private String type;
    private String size;
    private double drinkPrice;
    private String drinkInfo;


    public Drink(String type, String size) {
        switch (type.toLowerCase()) {
            case "coca-cola", "fanta", "sprite", "tonic", "coke" -> setType("Fizzy drink");
            case "earl grey", "black tea", "green", "white", "herbal", "forest fruit" -> setType("Tea");
            case "cappuccino", "flat white", "latte", "espresso", "black coffee" -> setType("Coffee");
            case "still", "sparkling" -> setType("Water");
            default -> setType("None");
        }
        setDrinkInfo("Drink: \n" + " · · " + getType() + " (" + type + ")");
        switch (size.toLowerCase()) {
            case "small", "s" -> setSize("Small - 200ml");
            case "medium", "mid", "average", "m" -> setSize("Medium - 350ml");
            case "large", "big", "l" -> setSize("Large - 500ml");
            default -> setSize("None");
        }
        setDrinkInfo(getDrinkInfo() + "\n · · size: " + getSize());
        switch (getSize()) {
            case "Small - 200ml" -> setDrinkPrice(5);
            case "Medium - 350ml" -> setDrinkPrice(8);
            case "Large - 500ml" -> setDrinkPrice(10);
            default -> setDrinkPrice(0);
        }
        setDrinkInfo(getDrinkInfo() + "\n · · · price: " + getDrinkPrice() + "\n\n");
    }

    public void changeSize(String change) {
        switch (change.toLowerCase()) {
            case "small", "s" -> setSize("Small - 200ml");
            case "medium", "mid", "average", "m" -> setSize("Medium - 350ml");
            case "large", "big", "l" -> setSize("Large - 500ml");
            default -> setSize("None");
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDrinkInfo() {
        return drinkInfo;
    }

    public void setDrinkInfo(String drinkInfo) {
        this.drinkInfo = drinkInfo;
    }
}
