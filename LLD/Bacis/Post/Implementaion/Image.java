package LLD.Bacis.Post.Implementaion;

import java.util.ArrayList;
import java.util.List;

import LLD.Bacis.Post.Interface.MediaPost;

public class Image implements MediaPost {
    final String message;
    int likes = 0;
    List<String> comments;
    final String media;

    public Image(String message, String media) {
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

    public void download() {
        System.out.println("playing video");
    }

    @Override
    public void addLike() {
        likes++;
    }
}
