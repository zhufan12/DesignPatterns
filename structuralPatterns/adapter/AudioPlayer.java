package structuralPatterns.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);         
        }else if(audioType.equalsIgnoreCase("mp4") || 
            audioType.equalsIgnoreCase("vlc")
        ){
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        } else{
            System.out.println("Invalid media. "+
               audioType + " format not supported");
         }
    }
    
}
