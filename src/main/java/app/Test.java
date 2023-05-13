package app;

import app.models.User;
import app.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class Test {

    private final ServiceLayer serviceLayer;

    @Autowired
    public Test(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }


    @GetMapping("/get")
    public String test () {
        return "file";
    }



    @GetMapping("/byid/{id}")
    public String getUserById (@PathVariable ("id") int id, Model model) throws Exception {
        User user = serviceLayer.getUserById(id);
        model.addAttribute("user", user);
        return "user";
    }


    @GetMapping("/allusers")
    public String getAllUsers (Model model) {
        List <User> allUsers = serviceLayer.getAllUsers();

            model.addAttribute("peopleuser", allUsers);

        return "people";
    }


}
