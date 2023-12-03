package com.programmerpoints.user.service;

import com.programmerpoints.user.model.User;
import com.programmerpoints.user.repos.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

  /*  @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getClass().getID());
        existingUser;
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }*/

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
