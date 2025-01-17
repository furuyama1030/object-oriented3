package Ex;

public class Medal {
    String name;//製品名
    int price;//製品の価格※材料のコスト＋従業員の給料の合計/製品数＊１．２

    public Medal(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
    
}
