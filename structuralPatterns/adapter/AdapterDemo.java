package structuralPatterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
 
        audioPlayer.play("mp3", "test.mp3");
        audioPlayer.play("mp4", "test3.mp4");
        audioPlayer.play("vlc", "test4.vlc");
        audioPlayer.play("avi", "test5.avi");
    }
}
