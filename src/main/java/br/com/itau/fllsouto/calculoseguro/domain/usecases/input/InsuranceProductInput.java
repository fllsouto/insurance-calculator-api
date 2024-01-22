package br.com.itau.fllsouto.calculoseguro.domain.usecases.input;

import java.math.BigDecimal;

import br.com.itau.fllsouto.calculoseguro.api.common.InsuranceProductCategory;

public class InsuranceProductInput {
    
    private String name;
    private InsuranceProductCategory category;
    private BigDecimal basePrice;

    public InsuranceProductInput(String name, InsuranceProductCategory category, 
        BigDecimal basePrice) {
        this.name = name;
        this.category = category;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public InsuranceProductCategory getCategory() {
        return category;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }
}


