package org.java.optionals;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
import org.java.streams.Account;

import java.util.Optional;

@FunctionalInterface
public interface AccountProvider {
    Optional<Account> getAccount();
}
