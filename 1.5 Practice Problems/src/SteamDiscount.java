public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {

        //declare and initialize variables
        int quantity = 1;
        double gamePrice = 60.0;
        final double discount = 20.0;
        final double discountRate = discount/100;

        double subTotal = quantity * gamePrice;

        double totalCost = subTotal * (1 - discountRate);

        System.out.println("you bought " + quantity + "STEAM games for some reason");
        System.out.println("Cost before discount: "  + "$" + subTotal);
        System.out.println("Cost after discount: " + "$" +totalCost);
    }
}
