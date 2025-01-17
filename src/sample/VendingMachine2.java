package sample;

public class VendingMachine2 {
    public static final int PRICE = 120;
    private int money = 0;
    private int stock = 0;



    public static int getPrice() {
        return PRICE;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    void refillStock(int stockToAdd) {
        if (this.stock >= 10) {
            System.out.println("商品がいっぱいです");
        } else {
            this.stock += stockToAdd;
            System.out.println("在庫が" + this.stock + "個になりました");
        }
    }

    void putMoney(int moneyToAdd) {
        this.money += moneyToAdd;
        System.out.println("入金金額が" + this.money + "円になりました");
    }

    void buyItem() {
        if (this.stock <= 0) {
            System.out.println("在庫を追加してください");
            return;
        }
        if (this.money <= 0) {
            System.out.println("お金を入れてください");
            return;
        }
        if (this.money < PRICE) {
            System.out.println("お金が足りません(現在の残高" + money + "円)");
            return;
        }
        System.out.println("商品を購入しました");
        this.stock -= 1;
        this.money -= PRICE;

        if (this.stock == 0) {
            System.out.println("在庫切れになりました");
        }

    }

}
