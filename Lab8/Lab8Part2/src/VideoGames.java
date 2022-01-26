public class VideoGames extends Hobbies{
    String genre;
    public VideoGames(){

    }

    public VideoGames(String name, String genre){
        super(name);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "VideoGames{" +
                "Name of the game: " + name + '\'' +
                ", genre: " + genre + '\'' +
                '}';
    }
}
