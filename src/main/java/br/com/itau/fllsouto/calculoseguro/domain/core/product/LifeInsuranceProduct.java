package br.com.itau.fllsouto.calculoseguro.domain.core.product;

import java.math.BigDecimal;

import br.com.itau.fllsouto.calculoseguro.domain.input.InsuranceProductInput;

public class LifeInsuranceProduct extends AbstractInsuranceProduct {

    public LifeInsuranceProduct(String category, BigDecimal iof, BigDecimal pis, BigDecimal cofins) {
        super(category, iof, pis, cofins);
    }

    @Override
    public BigDecimal calculate(InsuranceProductInput input) {
        return BigDecimal.valueOf(100.23);
    }
    
}
