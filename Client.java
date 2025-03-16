public class Client {
    public static void main(String[] args) {
        Furniture[] items = {
            new Chair(10),
            new Table(50),
            new Sofa(300)
        };

        ShippingCostCalculator calculator = new ShippingCostCalculator();

        for (Furniture item : items) {
            item.accept(calculator);
        }

        System.out.println("Total shipping cost: $" + calculator.getTotalCost());
    }
}
