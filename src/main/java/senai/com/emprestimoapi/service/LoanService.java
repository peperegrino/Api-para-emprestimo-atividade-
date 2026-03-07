package senai.com.emprestimoapi.service;

import org.springframework.stereotype.Service;
import senai.com.emprestimoapi.DTOS.LoanRequestDTO;
import senai.com.emprestimoapi.DTOS.LoanResponseDTO;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.Repositories.LoanRepository;
import senai.com.emprestimoapi.Repositories.UserRepository;
import senai.com.emprestimoapi.entities.Loan;
import senai.com.emprestimoapi.entities.User;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
  private final LoanRepository loanRepository;


    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }



    public LoanResponseDTO createLoan(LoanRequestDTO dto) {
  Loan loan = new Loan(dto.getLoanDate(), dto.getDevolutionDate());
  loanRepository.save(loan);
  return new LoanResponseDTO(loan);

     }

     public List<Loan> showLoans() {
         return loanRepository.findAll();
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }

    public Loan updateLoan(Long id , LoanRequestDTO dto) {
        Loan l = loanRepository.findById(id).orElse(null);

        if (l != null) {
            l.setLoanDate(dto.getLoanDate());
            l.setDevolutionDate(dto.getDevolutionDate());
            return loanRepository.save(l);
        } else {
            return null;
        }
    }
}

