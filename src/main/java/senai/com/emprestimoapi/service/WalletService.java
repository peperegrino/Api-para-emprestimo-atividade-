package senai.com.emprestimoapi.service;

import org.springframework.stereotype.Service;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.DTOS.UserResponseDTO;
import senai.com.emprestimoapi.DTOS.WalletRequestDTO;
import senai.com.emprestimoapi.DTOS.WalletResponseDTO;
import senai.com.emprestimoapi.Repositories.WalletRepository;
import senai.com.emprestimoapi.entities.User;
import senai.com.emprestimoapi.entities.Wallet;

@Service
public class WalletService {

    private final WalletRepository walletRepository;
    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }




        public WalletResponseDTO createWallet(WalletRequestDTO dto) {
            Wallet wallet = new Wallet(dto.getEmissionDate(), dto.getIsvalid());
            walletRepository.save(wallet);
            return new WalletResponseDTO(wallet);
        }


    }

