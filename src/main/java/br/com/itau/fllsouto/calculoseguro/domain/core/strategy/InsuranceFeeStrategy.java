package br.com.itau.fllsouto.calculoseguro.domain.core.strategy;

import java.math.BigDecimal;

import br.com.itau.fllsouto.calculoseguro.domain.input.InsuranceProductInput;

public interface InsuranceFeeStrategy {
    
    public BigDecimal calculate(InsuranceProductInput input);
}
