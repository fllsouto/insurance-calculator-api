package br.com.itau.fllsouto.calculoseguro.domain.core.product;

import java.math.BigDecimal;

import br.com.itau.fllsouto.calculoseguro.domain.core.strategy.InsuranceFeeStrategy;

abstract class AbstractInsuranceProduct implements InsuranceFeeStrategy {
    
    private String category;
    private BigDecimal iof;
    private BigDecimal pis;
    private BigDecimal cofins;

    public AbstractInsuranceProduct(String category, BigDecimal iof, BigDecimal pis, BigDecimal cofins) {
        this.category = category;
        this.iof = iof;
        this.pis = pis;
        this. cofins = cofins;
    }
}
