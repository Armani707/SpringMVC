package app.service;

import app.models.User;
import app.repository.RepositoryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {

    private final RepositoryLayer repositoryLayer;

    @Autowired
    public ServiceLayer(RepositoryLayer repositoryLayer) {
        this.repositoryLayer = repositoryLayer;
    }

    public User getUserById(int id) throws Exception {
        List<User> userList = repositoryLayer.getAllUsers();
        User user = null;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                user = userList.get(i);
            } /*else {
                throw new Exception();
            }*/
        }
        return user;
    }


    public List<User> getAllUsers() {
        List <User> userList = repositoryLayer.getAllUsers();
        return userList;
    }
}
