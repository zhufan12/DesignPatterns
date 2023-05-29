package structuralPatterns.adapter;

public class MediaAdapter implements MediaPlayer {

    AdapterMediaPlayer adapterMediaPlayer;

    public MediaAdapter(String mediaType){
        if(mediaType.equalsIgnoreCase("mp4")){
            adapterMediaPlayer = new Mp4MediaPlayer();
        }else if(mediaType.equalsIgnoreCase("vlc")){
            adapterMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String mediaType, String fileName) {
        if(mediaType.equalsIgnoreCase("mp4")){
                adapterMediaPlayer.playMp4(fileName);
        }else if(mediaType.equalsIgnoreCase("vlc")){
                adapterMediaPlayer.playVlc(fileName);
        }
    }
    
}
