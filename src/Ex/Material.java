package Ex;

public class Material {
    String name ;//材料名
    int cost ; //コスト(原価)

    public Material(String name,int cost){
        this.name=name;
        this.cost=cost;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    
}
