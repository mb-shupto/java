package uml.java;

public class Main {
    public static void main(String[] args) {

        // creating an artist
        Artist artist = new Artist("Steven Wilson", 60, "Progressive Rock");

        //creating songs
        Music song1 = new Music("Time Flies", 1105, "Progressive Rock");
        Music song2 = new Music("Arriving Somewhere But Not Here",1203, "Progressive Rock" );

        //adding songs to the artist
        artist.addSong(song1);
        artist.addSong(song2);

        //playing a song
        song1.play();

        //artist performing
        artist.perform();

        //show all songs by the artist
        artist.showSongs();
    }
}
