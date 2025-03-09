package LLD.Bacis.User.Implementation;

import java.util.ArrayList;
import java.util.List;

import LLD.Bacis.Post.Interface.Post;
import LLD.Bacis.User.Interface.User;

public class UserImp implements User {

    List<Post> posts;

    final String name;

    public UserImp(String name){
        posts = new ArrayList<Post>();
        this.name = name;
    }
    @Override
    public boolean makePost(Post post) {
        posts.add(post);
        return true;
    }

    @Override
    public boolean like(Post post) {
        int index = posts.indexOf(post);
        posts.get(index).addLike();
        return true;
    }

    @Override
    public boolean comment(Post post, String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comment'");
    }

    @Override
    public void sendMessage(User to) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendMessage'");
    }
    @Override
    public List<Post> getPost() {
        return posts;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
