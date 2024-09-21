public class Speaker implements VolumenControlable {

    private String brand = "";
    private int volume = 0;
    private int numSpeakers = 0;
    private int wattsPower = 0;
    private static int speakerCount = 0;

    public Speaker() {
        speakerCount++;
    }

    public int getVolume(){
        return volume;
    }

    public void volumeUp(int volume){
        this.volume += volume;
    }

    public void volumeDown(int volume){
        this.volume -= volume;
    }

    public void muteVolume(boolean mute){
        volume = mute ? volume : 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumSpeakers() {
        return numSpeakers;
    }

    public void setNumSpeakers(int numSpeakers) {
        this.numSpeakers = numSpeakers;
    }

    public int getWattsPower() {
        return wattsPower;
    }

    public void setWattsPower(int wattsPower) {
        this.wattsPower = wattsPower;
    }


    public static void main(String[] args) {
        Speaker speaker1 = new Speaker();
        speaker1.setBrand("JBL");
        speaker1.setNumSpeakers(3);
        speaker1.setWattsPower(30);

        System.out.println(speaker1.getBrand() + ", " + speaker1.getNumSpeakers() + ", " + speaker1.getWattsPower());

        Speaker speaker2 = new Speaker();
        speaker2.setBrand("Beats");
        speaker2.setNumSpeakers(5);
        speaker2.setWattsPower(50);

        System.out.println(speaker2.getBrand() + ", " + speaker2.getNumSpeakers() + ", " + speaker2.getWattsPower());

        Speaker speaker3 = new Speaker();
        speaker3.setBrand("Skullcandy");
        speaker3.setNumSpeakers(2);
        speaker3.setWattsPower(25);

        System.out.println(speaker3.getBrand() + ", " + speaker3.getNumSpeakers() + ", " + speaker3.getWattsPower());
    }
}


