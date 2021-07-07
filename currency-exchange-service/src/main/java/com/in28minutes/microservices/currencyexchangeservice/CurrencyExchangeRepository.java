package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM CURRENCY_EXCHANGE WHERE CURRENCY_FROM = :from AND CURRENCY_TO = :to")
    CurrencyExchange findByFromTo(String from, String to);
}
