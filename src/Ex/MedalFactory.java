package Ex;

public class MedalFactory {
    Employee[] employees;

    void makeMedal(Material[] materials) {
        // 従業員の給料合計を計算
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();

            for (Material material : materials) {
                String materialName = material.getName();

                int price = (material.getCost() + totalSalary) / 4 * 12;
                
                if (materialName.equals("金")) {
                    Medal medal = new Medal("金メダル", price);
                } else if (materialName.equals("銀")) {
                    Medal medal = new Medal("銀メダル", price);
                } else if (materialName.equals("銅")) {
                    Medal medal = new Medal("銅メダル", price);
                } else {
                    Medal medal = new Medal("不良品", price);
                    return;
                }
            }
        }
    }
}