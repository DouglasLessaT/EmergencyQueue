package com.DouglasLessa.emergencyBedApi.services.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DouglasLessa.emergencyBedApi.model.security.User;
import com.DouglasLessa.emergencyBedApi.repository.security.UserRepository;




@Service
public class UserService {
 @Autowired
 UserRepository userRepository;

 public User insert(User user) {
  User _comp = userRepository.findByLogin(user.getLogin());
  if (_comp != null) {
   throw new RuntimeException("Usuário com login " + user.getLogin() + " já existe");
  }
  return userRepository.save(user);
 }

 public UserRepository repository() {
  return this.userRepository;
 }
}