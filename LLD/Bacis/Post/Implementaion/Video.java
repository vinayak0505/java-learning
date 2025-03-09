package LLD.Bacis.Post.Implementaion;

import java.util.ArrayList;
import java.util.List;

import LLD.Bacis.Post.Interface.MediaPost;

public class Video implements MediaPost {
    private final String message;
    private int likes = 0;
    private List<String> comments;
    private final String media;

    public Video(String message, String media) {
        this.message = message;
        this.media = media;
        comments = new ArrayList<String>();
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getMedia() {
        return media;
    }

    @Override
    public int getLikes() {
        return likes;
    }

    @Override
    public List<String> getComments() {
        return comments;
    }

    public void play() {
        System.out.println("playing video");
    }

    public void pause() {
        System.out.println("pausing video");
    }

    @Override
    public void addLike() {
        likes++;
    }
}
