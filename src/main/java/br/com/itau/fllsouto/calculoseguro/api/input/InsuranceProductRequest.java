package br.com.itau.fllsouto.calculoseguro.api.input;

import java.math.BigDecimal;

import br.com.itau.fllsouto.calculoseguro.api.common.InsuranceProductCategory;
import br.com.itau.fllsouto.calculoseguro.domain.input.InsuranceProductInput;

public class InsuranceProductRequest {
    
    private String name;
    private InsuranceProductCategory category;
    private BigDecimal basePrice;

    public InsuranceProductRequest(String name, InsuranceProductCategory category, 
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

    public InsuranceProductInput toInput() {
        return new InsuranceProductInput(
            this.name, this.category, this.basePrice
        );
    }
}


