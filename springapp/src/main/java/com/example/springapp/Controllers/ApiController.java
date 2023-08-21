import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
    @ResponseBody
    @RequestMapping("/welcome")
    public String Welcome()
    {
     return "Welcome String Boot";
    }  
}
