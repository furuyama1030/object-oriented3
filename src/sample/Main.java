package sample;

public class Main {
        // Managerオブジェクトの情報を表示するメソッド
        public static void displayInfo(Manager manager) {
            System.out.println("Name: " + manager.getName());
            System.out.println("ID: " + manager.getId());
            System.out.println("Salary: " + manager.getSalary());
            System.out.println("Department: " + manager.getDepartment());
            System.out.println(); // 各情報の後に空行を追加
        }

        public static void main(String[] args) {
            // 3人のManagerオブジェクトを作成
            Manager[] managers = new Manager[3];
            managers[0] = new Manager("Taro Yamada", 101, 80000.0, "Sales");
            managers[1] = new Manager("Hanako Suzuki", 102, 90000.0, "Marketing");
            managers[2] = new Manager("Ichiro Tanaka", 103, 85000.0, "HR");

            // 配列をループして、全員分の情報を表示
            for (Manager manager : managers) {
                displayInfo(manager);
            }
        }
    }

    