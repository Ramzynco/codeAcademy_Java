public class Main {
    public static void main(String[] args){
        Order book = new Order(true,9.99,"Express");
        book.ship();

        Order chemistrySet = new Order(false,72.50,"Regular");
        chemistrySet.ship();



    }
}
