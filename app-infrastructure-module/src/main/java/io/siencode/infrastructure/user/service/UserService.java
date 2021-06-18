package io.siencode.infrastructure.user.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

//    private final PasswordEncoder passwordEncoder;
//    private final UserRepository userRepository;
//
//    public UserService(PasswordEncoder passwordEncoder, UserRepository userRepository) {
//        this.passwordEncoder = passwordEncoder;
//        this.userRepository = userRepository;
//    }
//
//    public void saveUser(UserModel userModel) {
//        UserEntity user = new UserEntity();
//        user.setUsername(userModel.getUsername());
//        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
//        user.grantAuthority(Role.ROLE_USER);
//        try {
//            userRepository.save(user);
//        } catch (Exception exception) {
//            throw new ResponseStatusException(HttpStatus.CONFLICT, "user cannot be added");
//        }
//    }
//
//    public Boolean userIsExist(String username) {
//        Optional<User> userOptional = userRepository.findByUsername(username);
//        return userOptional.isPresent();
//    }
//
//    public User getAuthorizedUser() {
//        Authentication authenticator = SecurityContextHolder.getContext().getAuthentication();
//        String userName = authenticator.getName();
//        Optional<User> userOptional = userRepository.findByUsername(userName);
//        if (userOptional.isPresent()) {
//            return userOptional.get();
//        } else {
//            throw new RuntimeException(userName + " not found");
//        }
//    }
//
//    public User getUserByUsername(String userName) {
//        Optional<User> userOptional = userRepository.findByUsername(userName);
//        return userOptional.orElse(null);
//    }
}
