public class SideItem {

    private String type;
    private double sideItemPrice;
    private String sideItemInfo;

    public SideItem(String type) {

        switch (type.toLowerCase()) {
            case "french fries", "fries", "frenchfries" -> setType("French Fries");
            case "onion rings", "onionrings", "onion" -> setType("Onion Rings");
            case "sweet potato fries", "sweet fries", "sweetpotatofries", "sweetfries" -> setType("Sweet potato fries");
            case "nuggets" -> setType("Nuggets");
            case "corn", "corn on the cob", "cornonthecob" -> setType("Corn on the Cob");
            default -> setType("None");
        }
        setSideItemInfo("Side item: \n" + " · · " + getType());
        switch (getType()) {
            case "French Fries" -> setSideItemPrice(9.5);
            case "Onion Rings" -> setSideItemPrice(11.5);
            case "Sweet potato fries" -> setSideItemPrice(14.2);
            case "Nuggets" -> setSideItemPrice(10.4);
            case "Corn on the Cob" -> setSideItemPrice(8.8);
            default -> setSideItemPrice(0);
        }
        setSideItemInfo(getSideItemInfo()  + "\n · · · price: " + getSideItemPrice() + "\n");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSideItemPrice() {
        return sideItemPrice;
    }

    public void setSideItemPrice(double sideItemPrice) {
        this.sideItemPrice = sideItemPrice;
    }

    public String getSideItemInfo() {
        return sideItemInfo;
    }

    public void setSideItemInfo(String sideItemInfo) {
        this.sideItemInfo = sideItemInfo;
    }
}