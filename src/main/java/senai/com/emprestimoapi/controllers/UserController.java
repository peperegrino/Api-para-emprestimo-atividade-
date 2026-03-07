package senai.com.emprestimoapi.controllers;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.Repositories.UserRepository;
import senai.com.emprestimoapi.entities.User;
import senai.com.emprestimoapi.service.UserService;

@RestController
@RequestMapping
public class UserController {

   private final UserService userService;

   public UserController(UserService userService) {
       this.userService = userService;
   }

    @PostMapping
    public ResponseEntity<?> addUser(@Valid @RequestBody UserRequestDTO dto) {
        return ResponseEntity.ok(userService.createUser(dto));
    }

    @GetMapping
    public ResponseEntity<?> showAllUsers() {
        return ResponseEntity.ok(userService.showUsers());
    }

    @DeleteMapping
    public void delete(@Valid @RequestBody Long id) {
     userService.deleteUser(id);

    }

    @PutMapping
    public ResponseEntity<?> update(@Valid @RequestBody Long id, UserRequestDTO dto ) {
        return ResponseEntity.ok(userService.updateUser(id, dto));
    }



}
