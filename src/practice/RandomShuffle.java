package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class RandomShuffle {

    // assume we have 100 songs on our music playlist - play them in some shuffle mode

    // every time I download the songs - does it added at the start or end or in some sorting order - mostly at the start

    static HashMap<Integer , String > songsMap = new HashMap<>(); // (song -> index)
    static ArrayList<String> songs = new ArrayList<>(); // song


    static void addSongs(String song){
        if(songsMap.get(song) != null)
            return;
        int size = songs.size();

        // add to array at the end

        songs.add(song);

        // add in songs Map
        songsMap.put(size,song);

    }

    static int shuffleMusic(){

        // randomly get the song from play list

        Random random = new Random();
        int num = random.nextInt(songs.size());
        System.out.println("Random number -- " + num);

        return num;


    }

    public static void main(String[] args) {
        String str = "songs1,songs2,songs3,songs4,songs5,songs6,songs7";
        String [] songslist = str.split(",");
        for (String song: songslist){
            addSongs(song);
        }

        System.out.println(Arrays.toString(songs.toArray()));
        System.out.println(songsMap);

        int songNum = shuffleMusic();
        System.out.println("Song to be played -- " + songsMap.get(songNum));

    }
}

