package htmlpage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nad on 1/15/18.
 */
@org.springframework.stereotype.Controller
public class Controller
{
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndex()
    {
        return "index";
    }
}
