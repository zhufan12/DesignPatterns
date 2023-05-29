package structuralPatterns.adapter;

public class Mp4MediaPlayer implements AdapterMediaPlayer {

    @Override
    public void playVlc(String fileName) {
       
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);    

    }
    
}
