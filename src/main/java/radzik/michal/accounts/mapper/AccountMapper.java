package radzik.michal.accounts.mapper;

import radzik.michal.accounts.domain.dao.Account;
import radzik.michal.accounts.domain.dto.AccountDto;

import java.util.List;

public interface AccountMapper {

    AccountDto toDto (Account account);

    Account toDao (AccountDto accountDto);

    List<AccountDto> toDtos (List<Account> accounts);
}
