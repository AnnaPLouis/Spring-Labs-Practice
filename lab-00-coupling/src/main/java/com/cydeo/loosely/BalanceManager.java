package com.cydeo.loosely;

import java.math.BigDecimal;

public class BalanceManager {
    public boolean checkout(Balance balance, BigDecimal checkoutAmount){
        BigDecimal balanceAmount = balance.getAmount();

        return balanceAmount.subtract(checkoutAmount).compareTo(BigDecimal.ZERO)>=0;
    }
}
