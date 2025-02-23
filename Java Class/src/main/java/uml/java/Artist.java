package uml.java;
import java.util.ArrayList;

public class Artist {
    private final String name;
    private final ArrayList<Music> songs;   //an artist has multiple songs

    //constructor

    public Artist(String name, int age, String genre) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    //method to add a song to the artist's collection
    public void addSong(Music song){
        songs.add(song);
        System.out.println(song.getTitle() + " added to " + name + "'s collection.");
    }
    //method to perform
    public void perform(){
        System.out.println(name + " is performing live! ");
    }

    //method to show all songs
    public void showSongs(){
        System.out.println(name + "'s songs: ");
        for (Music song : songs) {
            System.out.println("- "+ song.getTitle());
        }
    }
}
