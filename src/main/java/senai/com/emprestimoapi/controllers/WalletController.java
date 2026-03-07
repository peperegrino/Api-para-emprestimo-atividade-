package senai.com.emprestimoapi.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import senai.com.emprestimoapi.DTOS.WalletRequestDTO;
import senai.com.emprestimoapi.Repositories.WalletRepository;
import senai.com.emprestimoapi.service.WalletService;

@RestController
@RequestMapping
public class WalletController {
private final WalletService walletService;

public WalletController(WalletService walletService) {
    this.walletService = walletService;
}

@PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody WalletRequestDTO dto) {
    return  ResponseEntity.ok(walletService.createWallet(dto));

}

}
