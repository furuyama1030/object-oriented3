package sample;

class Bus extends Car {
    // メソッドをオーバーライドしても可視性は変えられない
    @Override
    public void stepOnAccele() {  // public のままオーバーライド
        super.stepOnAccele();  // 親クラスのメソッド呼び出し
        System.out.println("バスのスピードが増加しました");
    }
}
