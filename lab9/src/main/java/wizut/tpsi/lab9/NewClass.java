package wizut.tpsi.lab9;




import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class NewClass {

    @Autowired
    private BlogRepository blogRepository;
    
    @RequestMapping("/")
    public String getPosts(Model model) throws SQLException {
        model.addAttribute("allPosts", blogRepository.getAllPosts());
        return "index";
    }
    
    @PostMapping("/newpost")
        public String newPost(BlogPost post) throws SQLException {
        blogRepository.createPost(post);
        return "redirect:/";
    }
        
    @PostMapping("/deletepost")
    public String newPost(Delete post) throws SQLException {
        blogRepository.deletePost(post);
        return "redirect:/";
    }
}
