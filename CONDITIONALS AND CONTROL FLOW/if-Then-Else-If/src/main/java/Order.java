public class Order{
    boolean isFilled;
    double billAmount;
    String shipping;


    public Order(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship(){
        if(isFilled){
            System.out.println("Shipping!");
            System.out.println("Shipping Cost: " + calculateShipping());
        } else {
            System.out.println("We are packing your order!");
        }
    }

    public double calculateShipping(){
        if (shipping.equals("regular")){
            System.out.println(0);
        } else if (shipping.equals("Express")){
            System.out.println(1.75);

        } else {
            System.out.println(.50);
        }
        return 0;
    }
}


