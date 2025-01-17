package sample;

public class Ex01 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        
        bus.speed=10;
        
        bus.stepOnAccele();
        bus.stepOnBrake();
        bus.stepOnBrake();
    }
}
