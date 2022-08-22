package radzik.michal.accounts.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import radzik.michal.accounts.domain.dao.Account;
import radzik.michal.accounts.mapper.AccountMapper;
import radzik.michal.accounts.repository.AccountRepository;
import radzik.michal.accounts.service.AccountService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;

    private final AccountRepository accountRepository;


    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
       // return null;
    }

    @Override
    public List<Account> getAccountsByCustomerId(long id) {
        return null;
        //return accountRepository.getAccountsByCustomerId(id);
    }

    @Override
    public List<Account> getAccountsForCustomer(long customerId) {
        //return accountRepository.findAllByCustomerId(customerId);
        return null;
    }
}
