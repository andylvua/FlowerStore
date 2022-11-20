package ua.edu.ucu.apps.flowerstoreweb.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        if (userRepository.findUserByEmail(user.getEmail()).isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        userRepository.save(user);
    }
}
