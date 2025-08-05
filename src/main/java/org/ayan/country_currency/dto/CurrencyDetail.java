package org.ayan.country_currency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrencyDetail {
    private String name;
    private String symbol;
}
