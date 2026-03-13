package senai.com.emprestimoapi.DTOS;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import senai.com.emprestimoapi.entities.User;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private String nome;
    private String email;

    public UserResponseDTO(User u) {
        this.nome = u.getName();
        this.email = u.getEmail();
    }
}
