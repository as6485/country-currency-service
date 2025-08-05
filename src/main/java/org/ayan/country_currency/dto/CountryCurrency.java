package org.ayan.country_currency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class CountryCurrency {
    private Map<String, CurrencyDetail> currencies;
}
