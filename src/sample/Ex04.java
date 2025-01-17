package sample;

public class Ex04 {
    public static void main(String[] args) {
        
        Car estima = new Car();

        estima.setName("エスティマ");
        estima.setSpeed(30);

        System.out.println("現在のスピード"+estima.getSpeed());
        System.out.println("名前"+estima.getName());
    }
}
