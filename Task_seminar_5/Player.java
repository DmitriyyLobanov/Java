package Task_seminar_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {

    public static void main(String[] args) {

        List<Song> commonPlaylist = new ArrayList<>();
        commonPlaylist = GeneralList.createSongsList();
        commonPlaylist.sort(Comparator.comparing(Song::popularity).reversed());


        List<String> trainInGYM = Arrays.asList("Rock", "Rap");
        List<String> relax =Arrays.asList("Pop","Classic");
        List<String> cleaning =Arrays.asList("Rap", "Pop");

        System.out.println("Список воспроизведения для тренажерного зала:");
        playBack(trainInGYM, commonPlaylist, true);

        System.out.println("Список воспроизведения для релакса:");
        playBack(relax, commonPlaylist, true);

        System.out.println("Список воспроизведения для уборки:");
        playBack(cleaning, commonPlaylist, false);

    }
    public static void playBack(List<String> mood, List<Song> musicBase, boolean shuffle) {
        List<Song> tempPlayList = new ArrayList<>();
        List<Song> resPlayList = new ArrayList<>();
        for (Song song : musicBase) {
            if (mood.contains(song.genre())){
                tempPlayList.add(song);
            }
        }
        tempPlayList.sort(Comparator.comparing(Song::genre).thenComparing(Song::popularity).reversed());
        int count = 0;
        while(count <= 10){
            for (Song song : tempPlayList) {
                if(song.genre() == mood.get(0) && count <= 5){
                    resPlayList.add(song);
                    count++;
                }
                if(song.genre() == mood.get(1) && count <= 10){
                    resPlayList.add(song);
                    count++;
                }
            }
            
        }
        if(shuffle){
            Collections.shuffle(resPlayList);
            for (Song song : resPlayList) {
                System.out.printf("Жанр: %s, Популярность: %d\n", song.genre(), song.popularity());
            }
        }else{
            for (Song song : resPlayList) {
                System.out.printf("Жанр: %s, Популярность: %d\n", song.genre(), song.popularity());
            }
        }

    }
}
