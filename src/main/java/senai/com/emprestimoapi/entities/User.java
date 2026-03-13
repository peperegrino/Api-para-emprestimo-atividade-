package senai.com.emprestimoapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Loan> loans = new ArrayList<>();


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
        private Wallet wallet;


    public User(@NotNull String nome, @Email String email) {
        this.name = nome;
        this.email = email;
    }
}
