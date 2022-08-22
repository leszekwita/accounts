package radzik.michal.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import radzik.michal.accounts.domain.dao.Account;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

   // List<Account> getAccountsByCustomerId(Long id);
    List<Account> findAllByCustomerId(Long id);
}
