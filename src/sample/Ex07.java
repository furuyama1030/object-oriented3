package sample;

public class Ex07 {
    public static void main(String[] args) {
        VendingMachine2 machine =new VendingMachine2();

        machine.buyItem();
        machine.refillStock(3);
        machine.buyItem();
        machine.putMoney(500);
        machine.buyItem();
        machine.buyItem();
        machine.buyItem();
        machine.refillStock(3);
        machine.buyItem();
        machine.buyItem();
        machine.buyItem();
    }
}
