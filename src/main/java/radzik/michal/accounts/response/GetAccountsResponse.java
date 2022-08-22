package radzik.michal.accounts.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import radzik.michal.accounts.domain.dto.AccountDto;

import java.util.List;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class GetAccountsResponse {

    private List<AccountDto> accounts;

}
