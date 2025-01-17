package sample;

public class Taxi extends Car {
    
    int price;//料金を表す属性

    //支払う操作
    void payment(){
        System.out.println("料金を"+price+"円支払いました");
        price=0;//料金を支払ったため
    }

    //Carクラスのメソッドをオーバーライド
    @Override
    public void stepOnAccele(){
    //     speed+=10;
    //     System.out.println("スピードが"+speed+"km/hに増えました");

        //省略する場合
        super.stepOnAccele();

        //オーバーライドは継承元の属性や操作に加えての操作ができる（引数は同じでなくてはならない）
        price+=90;
        System.out.println("料金が"+price+"円に増えました");
    }
}
