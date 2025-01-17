package sample;
public class TV2 implements Electrical {
    //電源oN/OFFを表す
    private boolean powerOn;
    //チャンネル
    private int channel;

    //インターフェースで定義されている抽象メソッドを実装
    //しなければコンパイルエラー
    @Override
    public void power(){
        if(powerOn){
            System.out.println("テレビの電源が切れました");
            powerOn=false;
        }else{
            System.out.println("テレビの電源が入りました");
            powerOn=true;
        }
    }

    //チャンネル切り替え
    public void changeChannel(int channel){
        if(powerOn){
            System.out.println("テレビの電源を入れてください");
            return;
        }
        this.channel=channel;
        System.out.println((this.channel+"チャンネルに切り替わりました"));
    }

}
