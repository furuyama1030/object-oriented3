package sample;

public class PC implements Electrical {
    private boolean powerOn;

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public void power() {
            if (powerOn) {
                System.out.println("PCの電源が切れました");
                powerOn = false;
                return;
            }else
            powerOn=false;
            System.out.println("設定ファイルを読み込んでいます");
            System.out.println("PCの電源が入りました");    
            
            
        }
}
