class ShippingCostCalculator implements ShippingCostVisitor {
    private double totalCost = 0;

    @Override
    public void visit(Chair chair) {
        double cost = 5.0; // Flat rate for chairs
        System.out.println("Chair shipping cost: $" + cost);
        totalCost += cost;
    }

    @Override
    public void visit(Table table) {
        double cost = 10.0 + 0.5 * table.getVolume(); // Base rate + volume-based
        System.out.println("Table shipping cost: $" + cost);
        totalCost += cost;
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = 20.0 + 1.0 * sofa.getDistance(); // Base rate + distance-based
        System.out.println("Sofa shipping cost: $" + cost);
        totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}