package org.sid.bank_account_service.service;

import org.sid.bank_account_service.dto.BankAccountResponseDTO;
import org.sid.bank_account_service.dto.BankAccountRequestDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
