package com.ormispring.basic.spring_0628;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepositoryInterface userRepository;

  @Autowired
  public UserService(UserRepositoryInterface userRepository) {
    this.userRepository = userRepository;
  }

  public void createUser(User user) {
    userRepository.save(user);
  }

  public void deleteUser(User user) {
    userRepository.delete(user);
  }
}
