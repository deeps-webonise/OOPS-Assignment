//This is for a specific TV
public class Television extends TV implements ITV  {
    boolean power;
    int channelNo;
    int volume;

    public Television() {
        this.power = false;
        this.channelNo = 100;
        this.volume = 10;
        this.modelNo = 213;
        this.screensize=29;
        this.YearOfManufacture=2010;
    }

    public void on() {
        this.power=true;
        System.out.println("TV is switched on");
    }

    public void off() {
        this.power=false;
        System.out.println("TV is switched off");
    }

    public void increaseVolume() {
        this.volume = volume + 1;
        System.out.println("TV's volume has increased by 1 \nNew Volume is " + this.volume + " ");
    }

    public void decreaseVolume() {
        this.volume = volume - 1;
        System.out.println("TV's volume has decreased by 1 \nNew Volume is " +this.volume + " ");
    }

    public void setChannel(int channelNo) {
        this.channelNo=channelNo;
        System.out.println("Channel changed to " + this.channelNo +" ");

    }

}