package senai.com.emprestimoapi.service;

import org.springframework.stereotype.Service;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.DTOS.UserResponseDTO;
import senai.com.emprestimoapi.Repositories.UserRepository;
import senai.com.emprestimoapi.entities.User;

import java.util.List;

@Service
public class UserService {
   private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO createUser(UserRequestDTO dto) {
        User u = new User(dto.getNome(), dto.getEmail());
        userRepository.save(u);
        return new UserResponseDTO(u);
    }

    public List<User> showUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }


    public User updateUser(Long id , UserRequestDTO dto) {
        User u = userRepository.findById(id);

        if (u != null){
            u.setName(dto.getNome());
            u.setEmail(dto.getEmail());
            return userRepository.save(u);
        }else {
            return null;
        }


    }

}
