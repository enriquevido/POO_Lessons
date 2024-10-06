public class Speaker implements VolumenControlable {

    boolean on;
    private int volume;
    private int numSpeakers;

    private static int speakerCount = 0;

    public Speaker(int numSpeakers) {
        on = false;
        volume = 0;
        this.numSpeakers = numSpeakers;
        speakerCount++;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setVolume(int volume) {
        if (on)
            this.volume = volume;
    }

    @Override
    public void volumeUp(){
        if (on && volume < 10)
            volume++;
    }

    @Override
    public void volumeDown(){
        if (on && volume > 1)
            volume--;
    }

    @Override
    public void muteVolume(){
        if (on && volume > 0)
            volume = 0;
    }

    public int getVolume(){
        return volume;
    }

    public int getNumSpeakers() {
        return numSpeakers;
    }
}


