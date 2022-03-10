package spring.hasib.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
@Autowired RepositoryHasib repositoryHasib;

    @GetMapping("/test")
    public ModelHasib test(@RequestParam(name = "hall") String hall, @RequestParam (name = "hello") int hello, @RequestParam(name = "room") String room){
        ModelHasib modelHasib = new ModelHasib();
        modelHasib.setHall(hall);
        modelHasib.setHello(hello);
        modelHasib.setroom(room);
        repositoryHasib.save(modelHasib);
        return modelHasib;
    }
}
