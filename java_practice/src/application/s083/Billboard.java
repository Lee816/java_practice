package application.s083;

import java.io.Serializable;

public class Billboard implements Serializable {
    private int rank;
    private String song;
    private int lastweek;
    private String imagesrc;
    private String artistsrc;
    private String artist;

    public Billboard() {}
    public Billboard(int rank, String song, int lastweek, String imagesrc, String artistsrc, String artist){
        super();
        this.rank = rank;
        this.song = song;
        this.lastweek = lastweek;
        this.imagesrc = imagesrc;
        this.artistsrc = artistsrc;
        this.artist = artist;
    }

    public Billboard(int rank, String song, int lastweek, String imagesrc, String artist){
        super();
        this.rank = rank;
        this.song = song;
        this.lastweek = lastweek;
        this.imagesrc = imagesrc;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "[rank="+rank+" song="+song+", lastweek="+lastweek+", imagesrc="+imagesrc+", artist="+artist+"]";
    }

    public int getRank(){
        return rank;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public String getSong(){
        return song;
    }

    public void setSong(String song){
        this.song = song;
    }

    public int getLastweek() {
        return lastweek;
    }

    public void setLastweek(int lastweek) {
        this.lastweek = lastweek;
    }

    public String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }

    public String getArtistsrc() {
        return artistsrc;
    }

    public void setArtistsrc(String artistsrc) {
        this.artistsrc = artistsrc;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
