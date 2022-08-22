package radzik.michal.accounts.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import radzik.michal.accounts.domain.dao.Account;
import radzik.michal.accounts.domain.dto.AccountDto;
import radzik.michal.accounts.mapper.AccountMapper;
import radzik.michal.accounts.response.GetAccountsResponse;
import radzik.michal.accounts.service.AccountService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/accounts")
@Slf4j
@RefreshScope
public class AccountController {

    @Value("${application.allow-get-accounts}")
    private boolean allowGetAccounts;

    private final AccountMapper accountMapper;

    private final AccountService accountService;

    @PostMapping
    public AccountDto saveAccount(@RequestBody AccountDto account) {
        return accountMapper.toDto(accountService.saveAccount(accountMapper.toDao(account)));
    }

    @GetMapping
    public GetAccountsResponse getAccounts(@RequestParam("customerId") Long customerId) {
        log.info("Get accounts for customerId:{}", customerId);
        if (!allowGetAccounts) {
            log.info("Getting accounts is disabled");
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Getting accounts is disabled");
        }
        List<Account> accountsForCustomer = accountService.getAccountsForCustomer(customerId);
        List<AccountDto> accounts = accountMapper.toDtos(accountsForCustomer);

        return GetAccountsResponse.of(accounts);
    }


}
