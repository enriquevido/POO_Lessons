public class Main {
    public static void main(String[] args) {
//        Speaker speaker1 = new Speaker(3);
//        speaker1.turnOn();
//        speaker1.setVolume(5);
//        speaker1.volumeDown();
//
//        if (speaker1.on) {
//            System.out.println("Speaker 1: Speakers " + speaker1.getNumSpeakers() + ", Volume " + speaker1.getVolume());
//        } else {
//            System.out.println("Speaker 1 is off");
//        }
//
//        Speaker speaker2 = new Speaker(5);
//        speaker2.turnOn();
//        speaker2.setVolume(10);
//        speaker2.muteVolume();
//
//        if (speaker2.on) {
//            System.out.println("Speaker 2: Speakers " + speaker2.getNumSpeakers() + ", Volume " + speaker2.getVolume());
//        } else {
//            System.out.println("Speaker 2 is off");
//        }
//
//        Speaker speaker3 = new Speaker(2);
//        speaker3.turnOn();
//        speaker3.volumeUp();
//        speaker3.turnOff();
//        if (speaker3.on) {
//            System.out.println("Speaker 3: Speakers " + speaker3.getNumSpeakers() + ", Volume " + speaker3.getVolume());
//        } else {
//            System.out.println("Speaker 3 is off");
//        }

        int[] fromArray = {1, 2, 3, 4, 5, 6};
        int[] toArray = java.util.Arrays.copyOfRange(fromArray, 0, 5);
        for(int printArray : toArray) {
            System.out.print(printArray + " ");
        }
        System.out.println();

        System.out.println(java.util.Arrays.toString(toArray));
    }
}
