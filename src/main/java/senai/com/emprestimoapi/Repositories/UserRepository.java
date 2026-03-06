package senai.com.emprestimoapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.com.emprestimoapi.entities.Loan;
import senai.com.emprestimoapi.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Loan> {

    User findById(Long id);
}
