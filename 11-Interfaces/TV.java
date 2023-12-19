public class TV implements CanOnOff,CanChangeChannel, CanChangeVolume {
    boolean ison=false;
    int channelNo=1;
    int volume=1;

    @Override
    public void off() {
        ison=false;
    }

    @Override
    public void on() {
        ison=true;   
    }

    @Override
    public void channelDown() {
        if (ison){
            if (channelNo==1){

            } else {
            channelNo-=1;
            }
        }
        
    }

    @Override
    public void channelUp() {
        if (ison){
            if (channelNo==99){

            } else{
            channelNo+=1;
            }
        }
        
    }

    @Override
    public void setChannel(int channel) {
        if (ison){
            if (channel>0 && channel<100){
            channelNo=channel;
            }
        }
    }

    

    @Override
    public void volumeDown() {
        if (ison){
            if (volume!=1){
            volume-=1;
            }
        }
        
    }

    @Override
    public void volumeUp() {
        if (ison){
            if (volume!=10){
            volume+=1;
            }
        }
        
    }

    public void status(){
        if (ison){
            System.out.println("Wlaczony, kanal:"+channelNo+" Glosnosc:"+volume);
        } else{
            System.out.println("Wylaczony");
        }
    }
}
