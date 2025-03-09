package LLD.Bacis.Post.Implementaion;

import java.util.ArrayList;
import java.util.List;

import LLD.Bacis.Post.Interface.Post;

public class Text implements Post {

    final String message;
    int likes = 0;
    List<String> comments;

    public Text(String message){
        this.message = message;
        comments = new ArrayList<String>();
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getLikes() {
        return likes;
    }

    @Override
    public List<String> getComments() {
        return comments;
    }

    @Override
    public void addLike() {
        likes++;
    }
    
}
