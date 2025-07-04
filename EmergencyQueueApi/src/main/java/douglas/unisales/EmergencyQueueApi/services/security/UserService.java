package douglas.unisales.EmergencyQueueApi.services.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import douglas.unisales.EmergencyQueueApi.model.security.User;
import douglas.unisales.EmergencyQueueApi.repository.security.UserRepository;

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