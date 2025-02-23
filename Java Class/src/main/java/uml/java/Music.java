package uml.java;

class Music {
    private String title;
    private int duration;
    private String genre;

    //constructor

    public Music(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    //method to play the song
    public void play(){
        System.out.println("Playing: " + title);
    }
    //method to pause the song
    public void pause(){
        System.out.println(title + "is paused. ");
    }
    public String getTitle(){
        return title;
    }
}
