package LLD.Bacis.User.Interface;

import java.util.List;

import LLD.Bacis.Post.Interface.Post;

public interface User {
    boolean makePost(Post post);
    boolean like(Post post);
    boolean comment(Post post, String message);

    void sendMessage(User to);

    List<Post> getPost();

    String getName();

}
