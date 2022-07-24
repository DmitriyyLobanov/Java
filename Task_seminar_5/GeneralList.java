package Task_seminar_5;

import java.util.ArrayList;
import java.util.List;

public class GeneralList {

    public static List<Song> createSongsList() {
        List<Song> songsList = new ArrayList<Song>();

        for (int i = 0; i < 40; i++) {
            if (i <= 10){
                songsList.add(i, new RapSong());
            }
            if(i > 10 && i <= 20){
                songsList.add(i, new RockSong());
            }
            if(i > 20 && i <= 30){
                songsList.add(i, new PopSong());
            }else{
                songsList.add(i, new ClassicSong());
            }
            
        }
        
        return songsList;
    }
    
}
