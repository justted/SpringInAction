package soundsystem;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    //这里重载了构造器，保留了两种注入方式
    public BlankDisc() { }

    public BlankDisc(String artist, String title, List<String> tracks) {
        this.artist = artist;
        this.title = title;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track: tracks) {
            System.out.println("-Track: " + track);
        }
    }

    public void playTrack(int num) {
        System.out.println("-Track: " + tracks.get(num));
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public List<String> getTracks() {
        return tracks;
    }
}

