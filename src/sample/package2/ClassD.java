package sample.package2;

import sample.package1.ClassA;

public class ClassD extends ClassA {
    // public static void main(String[] args) {
    //     ClassA classA=new ClassA();

    //     classA.name="ほげほげ";
    //     classA.method();
    // }
    void ClassDmethod(){//インスタンス化することはできない
        name = "ふがふが";
        method();
    }
}

