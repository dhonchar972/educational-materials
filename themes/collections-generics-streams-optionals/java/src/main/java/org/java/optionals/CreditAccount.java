package org.java.optionals;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.java.streams.Account;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Setter
public class CreditAccount extends Account {
    private BigDecimal creditBalance;

    public Optional<BigDecimal> getCreditBalance() {
        return Optional.ofNullable(creditBalance);
    }
}
