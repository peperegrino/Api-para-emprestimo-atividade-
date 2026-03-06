package senai.com.emprestimoapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.com.emprestimoapi.entities.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
