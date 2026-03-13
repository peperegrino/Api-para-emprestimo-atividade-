package senai.com.emprestimoapi.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import senai.com.emprestimoapi.DTOS.WalletRequestDTO;
import senai.com.emprestimoapi.service.WalletService;

@RestController
@RequestMapping("/wallet")
public class WalletController {
private final WalletService walletService;

public WalletController(WalletService walletService) {
    this.walletService = walletService;
}

@PostMapping("/wallets")
    public ResponseEntity<?> createWallet(@Valid @RequestBody WalletRequestDTO dto) {
    return  ResponseEntity.ok(walletService.createWallet(dto));

}

}
