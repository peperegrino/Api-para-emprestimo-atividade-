package senai.com.emprestimoapi.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import senai.com.emprestimoapi.DTOS.LoanRequestDTO;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.service.LoanService;

@RestController
@RequestMapping
public class LoanController {
    private final LoanService loanService;


    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public ResponseEntity<?> addLoan(@Valid @RequestBody LoanRequestDTO dto) {
        return ResponseEntity.ok(loanService.createLoan(dto));
    }

    @GetMapping
    public ResponseEntity<?> getLoans() {
        return ResponseEntity.ok(loanService.showLoans());
    }

    @DeleteMapping
    public void delete(@Valid @RequestBody Long id) {
        loanService.deleteLoan(id);
    }

    @PutMapping
    public ResponseEntity<?> update(@Valid @RequestBody Long id, LoanRequestDTO dto ) {
        return ResponseEntity.ok(loanService.updateLoan(id, dto));
    }
}
