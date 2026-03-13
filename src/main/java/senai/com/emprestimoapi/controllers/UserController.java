package senai.com.emprestimoapi.controllers;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.DTOS.UserResponseDTO;
import senai.com.emprestimoapi.Repositories.UserRepository;
import senai.com.emprestimoapi.entities.User;
import senai.com.emprestimoapi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

   private final UserService userService;

   public UserController(UserService userService) {
       this.userService = userService;
   }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserRequestDTO dto) {
        return ResponseEntity.ok(userService.createUser(dto));
    }

    @GetMapping("/users")
    public ResponseEntity<?> showAllUsers() {
        return ResponseEntity.ok(userService.showUsers());
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@Valid @RequestBody Long id) {
     userService.deleteUser(id);

    }

    @PutMapping("users/{id}")
    public ResponseEntity<?> updateUser(@Valid @RequestBody Long id, UserRequestDTO dto ) {
        return ResponseEntity.ok(userService.updateUser(id, dto));
    }



}
