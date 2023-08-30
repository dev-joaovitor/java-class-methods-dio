public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.turnOn();
        System.out.println("Is TV on? " + smartTv.isOn);

        smartTv.decreaseVolume();
        smartTv.increaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();

        System.out.println("Which channel? " + smartTv.channel);
        System.out.println("Which volume? " +smartTv.volume);

        smartTv.changeChannel(13);
        System.out.println("Which channel? " + smartTv.channel);
    }
}
