package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null) {
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for (Song checked: this.songs) {
            if (checked.getTitle().equals(title))
                return checked;
        }
        return null;
    }

    public boolean addPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber -1;
        if ((index >= 0) && (index<this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("The album does not have a track "+ trackNumber);
        return false;
    }

    public boolean addPlayList(String title, LinkedList<Song> playList){
        if (findSong(title)!=null) {
            playList.add(findSong(title));
            return true;
        }
        System.out.println("Song "+ title + " is not in the list");
        return false;
    }


}
