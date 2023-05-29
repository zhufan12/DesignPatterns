package structuralPatterns.adapter;

public class VlcPlayer implements AdapterMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);    
    }

    @Override
    public void playMp4(String fileName) {

    }
    
}
