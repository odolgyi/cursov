package homework13;

public class DemoFactoryPattern {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        CarShop carShop = new CarShop(carFactory);

        System.out.println(carShop.buyCar(CarType.SEDAN));
        System.out.println(carShop.buyCar(CarType.HATCHBACK));
        System.out.println(carShop.buyCar(CarType.MINI_TRUCK));
        System.out.println(carShop.buyCar(CarType.PICKUP));
    }
}