public class SmartTv {
    // class scope variables, available on all methods
    boolean isOn = false;
    int channel = 1;
    int volume = 25;

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

    public void changeChannel(int newChannel){
        // newChannel: method scope
        channel = newChannel;
    }
    public void upChannel(){
        channel++;
    }
    public void downChannel(){
        channel--;
    }

    public void increaseVolume(){
        volume++;
        System.out.println("increasing volume to: " + volume);
    }
    public void decreaseVolume(){
        volume--;
        System.out.println("decreasing volume to: " + volume);
    }
}
