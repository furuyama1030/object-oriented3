package sample;

public class InstantiateCar {
    public static void main(String[] args) {
        Car estima =new Car();

        estima.setSpeed(30);
        estima.setName("エスティマ");

        System.out.println("スピードは"+estima.getSpeed()+"km/hです");
        System.out.println("車名は"+estima.getName()+"です");

    }
}
