package radzik.michal.accounts.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import radzik.michal.accounts.domain.dao.Customer;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    private Long id;
    private String nrb;
    private String currency;
    private BigDecimal availableFunds;
    private Long customerId;
}
