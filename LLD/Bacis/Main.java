package LLD.Bacis;

import java.util.List;

import LLD.Bacis.Post.Implementaion.Text;
import LLD.Bacis.Post.Implementaion.Video;
import LLD.Bacis.Post.Interface.MediaPost;
import LLD.Bacis.Post.Interface.Post;
import LLD.Bacis.User.Implementation.UserImp;
import LLD.Bacis.User.Interface.User;

public class Main {
    public static void main(String[] args) {
        User user = new UserImp("vinayak");
        Post post = new Text("test");
        user.makePost(post);

        Post post2 = new Video("hello", "media");
        user.makePost(post2);

        List<Post> posts = user.getPost();

        for(Post _post : posts){
            // check if post is of type mediapost implementation
            if(_post instanceof MediaPost){
                // get Media
                MediaPost mediaPost = (MediaPost) _post;
                System.out.println(mediaPost.getMedia());
            }else{
                System.out.println(_post.getMessage()+ " " + user.getName());
            }

            if(_post instanceof Video){
                Video mediaPost = (Video) _post;
                mediaPost.play();
            }
        }
    }
}
