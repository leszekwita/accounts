package radzik.michal.accounts.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    private String nrb;
    private String currency;
    private BigDecimal availableFunds;
   /* @ManyToOne
    private Customer customer;*/


    private Long customerId;
}
