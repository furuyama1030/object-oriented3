package sample;

public class TV {
    int channel;

    void changeChannel(int channel){
        if(channel<=0||13<=channel){
            System.out.println("チャンネルは１～１２までのあいだで設定してください");
            return;
        }
        this.channel=channel;
        System.out.println(this.channel+"チャンネルに切り替わりました");
    }
}
