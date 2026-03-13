package senai.com.emprestimoapi.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import senai.com.emprestimoapi.DTOS.LoanRequestDTO;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
    private final LoanService loanService;


    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/loans")
    public ResponseEntity<?> createLoan(@Valid @RequestBody LoanRequestDTO dto) {
        return ResponseEntity.ok(loanService.createLoan(dto));
    }

    @GetMapping("/loans")
    public ResponseEntity<?> showLoans() {
        return ResponseEntity.ok(loanService.showLoans());
    }

    @DeleteMapping("loans/{id}")
    public void deleteLoan(@Valid @RequestBody Long id) {
        loanService.deleteLoan(id);
    }

    @PutMapping("loans/{id}")
    public ResponseEntity<?> updateLoan(@Valid @RequestBody Long id, LoanRequestDTO dto ) {
        return ResponseEntity.ok(loanService.updateLoan(id, dto));
    }
}
