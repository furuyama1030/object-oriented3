package sample;

public class Polymorphism2 {
    public static void main(String[] args) {
        Car car=null;

        car=new Taxi();

        car.stepOnAccele();

        car=new Bus();

        car.stepOnAccele();

        //呼び出す側は関係なく、参照元のクラスの変数や操作が参照される
    }
}
