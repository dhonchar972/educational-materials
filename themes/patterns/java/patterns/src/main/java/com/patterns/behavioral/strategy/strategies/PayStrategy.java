package com.patterns.behavioral.strategy.strategies;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 *
 * Common interface for all strategies.
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
