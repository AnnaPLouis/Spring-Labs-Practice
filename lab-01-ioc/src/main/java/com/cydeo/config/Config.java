package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class Config {



    @Bean
    public Current currentBean(Currency currency){
        Current current = new Current();
        current.setAccountId(UUID.randomUUID());
        current.setAmount(new BigDecimal(250));
        current.setCurrency(currency);
        return current;
    }

    @Bean
    public Saving savingBean(Currency currency){
        Saving saving = new Saving();

        saving.setAccountId(UUID.randomUUID());
        saving.setAmount(new BigDecimal(500));
        saving.setCurrency(currency);
        return saving;
    }

    @Bean
    public Currency currency(){
        Currency currency = new Currency();
        currency.setCode("USD");
        currency.setName("Dollar");
        return currency;
    }
}
