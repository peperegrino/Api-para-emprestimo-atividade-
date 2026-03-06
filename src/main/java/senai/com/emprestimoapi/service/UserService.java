package senai.com.emprestimoapi.service;

import org.springframework.stereotype.Service;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.DTOS.UserResponseDTO;
import senai.com.emprestimoapi.Repositories.UserRepository;
import senai.com.emprestimoapi.entities.User;

import java.util.ArrayList;
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
        List<User> users = userRepository.findAll();
        return users;
    }

    public void deletUser(Long id) {

    }

    public User updateuser(Long id , UserRequestDTO dto) {
        User u = userRepository.findById(id);

        if (u != null){
            u.setName(dto.getNome());
            u.setEmail(dto.getEmail());
            return u;
        }else {
            return null;
        }


    }

}
