//THis is for the remote Control
//It holds the Tv reference
public  class RemoteControl implements ITV {

    ITV tv;

    public RemoteControl(ITV tv){
        this.tv = tv;
    }

    public void on(){
        tv.on();
    }

    public void off(){
        tv.off();
    }

    public void setChannel(int channel){
        tv.setChannel(channel);
    }

    public void increaseVolume(){
        tv.increaseVolume();
    }

    public void decreaseVolume(){
        tv.decreaseVolume();
    }
}
