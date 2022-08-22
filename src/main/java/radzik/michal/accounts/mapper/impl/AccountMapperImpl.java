package radzik.michal.accounts.mapper.impl;

import org.springframework.stereotype.Component;
import radzik.michal.accounts.domain.dao.Account;
import radzik.michal.accounts.domain.dto.AccountDto;
import radzik.michal.accounts.mapper.AccountMapper;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccountMapperImpl implements AccountMapper {
    @Override
    public AccountDto toDto(Account account) {
        return AccountDto.builder().nrb(account.getNrb()).availableFunds(account.getAvailableFunds()).currency(account.getCurrency()).customerId(account.getCustomerId()).build();
    }

    @Override
    public Account toDao(AccountDto accountDto) {
        return Account.builder().nrb(accountDto.getNrb()).availableFunds(accountDto.getAvailableFunds()).currency(accountDto.getCurrency()).customerId(accountDto.getCustomerId()).build();
    }

    @Override
    public List<AccountDto> toDtos(List<Account> accounts) {
        return accounts.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
