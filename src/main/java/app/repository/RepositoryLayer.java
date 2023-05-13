package app.repository;

import app.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryLayer {

    public List <User> getAllUsers () {
      List <User> allUsers = new ArrayList<>();
      allUsers.add(new User(1, "Ivan", 20));
      allUsers.add(new User(2,"Tolya", 21));
      allUsers.add(new User(3,"Danya", 22));
      return allUsers;
    }
}
