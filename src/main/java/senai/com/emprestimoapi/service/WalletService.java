package senai.com.emprestimoapi.service;

import org.springframework.stereotype.Service;
import senai.com.emprestimoapi.DTOS.UserRequestDTO;
import senai.com.emprestimoapi.DTOS.UserResponseDTO;
import senai.com.emprestimoapi.DTOS.WalletRequestDTO;
import senai.com.emprestimoapi.DTOS.WalletResponseDTO;
import senai.com.emprestimoapi.Repositories.UserRepository;
import senai.com.emprestimoapi.Repositories.WalletRepository;
import senai.com.emprestimoapi.entities.User;
import senai.com.emprestimoapi.entities.Wallet;

@Service
public class WalletService {
    private final UserRepository userRepository;
    private final WalletRepository walletRepository;
    public WalletService(UserRepository userRepository, WalletRepository walletRepository) {
        this.userRepository = userRepository;
        this.walletRepository = walletRepository;
    }




        public WalletResponseDTO createWallet(WalletRequestDTO dto) {
            User user = userRepository.findById(dto.getUserId());

            Wallet wallet = new Wallet(dto.getEmissionDate(), dto.isIsvalid());
            wallet.setUser(user);
            Wallet savedWallet = walletRepository.save(wallet);
            return new WalletResponseDTO(savedWallet);
        }


    }

