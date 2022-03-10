package spring.hasib.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.TypeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerTest {
    @Autowired RepositoryHasib repositoryHasib;

    @GetMapping("/")
    public String controllerTest(){
        return "post";
    }

    @GetMapping("Main")
    public String maintest()
    {
        return "Hasib";
        
    }

    @PostMapping("/test")
    public String testPost(@RequestParam(name = "hall") String hall, @RequestParam (name = "hello") int hello, @RequestParam(name = "room") String room){
        ModelHasib modelHasib = new ModelHasib();
        modelHasib.setHall(hall);
        modelHasib.setHello(hello);
        modelHasib.setroom(room);
        repositoryHasib.save(modelHasib);
        return "post";
    }
}
