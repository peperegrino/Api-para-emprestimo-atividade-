package senai.com.emprestimoapi.service;

import org.springframework.stereotype.Service;
import senai.com.emprestimoapi.Repositories.LoanRepository;
import senai.com.emprestimoapi.Repositories.UserRepository;

@Service
public class LoanService {
  private final LoanRepository loanRepository;


    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }


}
