package br.com.itau.fllsouto.calculoseguro.domain.usecases.output;

import java.math.BigDecimal;

import br.com.itau.fllsouto.calculoseguro.api.common.InsuranceProductCategory;
import br.com.itau.fllsouto.calculoseguro.api.output.InsuranceProductResponse;

public class InsuranceProductOutput {
    
    private String id;
    private String name;
    private InsuranceProductCategory category;
    private BigDecimal basePrice;
    private BigDecimal feePrice;

    public InsuranceProductOutput(String id, String name, InsuranceProductCategory category, 
        BigDecimal basePrice, BigDecimal feePrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.basePrice = basePrice;
        this.feePrice = feePrice;
    }

    public String getId() {
        return id;
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

    public BigDecimal getFeePrice() {
        return feePrice;
    }

    public InsuranceProductResponse toResponse() {
        return new InsuranceProductResponse(
            this.id,
            this.name,
            this.category,
            this.basePrice,
            this.feePrice
        );
    }
}


