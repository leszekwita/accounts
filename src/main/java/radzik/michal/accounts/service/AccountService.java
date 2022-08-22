package radzik.michal.accounts.service;

import radzik.michal.accounts.domain.dao.Account;
import radzik.michal.accounts.domain.dto.AccountDto;

import java.util.List;

public interface AccountService {

    Account saveAccount(Account account);

    List<Account> getAccountsByCustomerId(long customerId);
    List<Account> getAccountsForCustomer(long customerId);
}
