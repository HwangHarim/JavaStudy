package ProductExample;

public class ProductExample {
    public static void main(String[] args){
        Product<Tv, String> product1 = new Product<Tv, String>();
        product1.setKind(new Tv());
        product1.setModel("스마트 TV");
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("디젤");
        String carModel = product2.getModel();
    }

    private static class Tv {
    }

    private static class Car {
    }
}
