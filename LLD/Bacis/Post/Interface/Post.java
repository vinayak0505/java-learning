package LLD.Bacis.Post.Interface;

import java.util.List;

public interface Post {

    String getMessage();


    int getLikes();

    List<String> getComments();

    void addLike();
}
