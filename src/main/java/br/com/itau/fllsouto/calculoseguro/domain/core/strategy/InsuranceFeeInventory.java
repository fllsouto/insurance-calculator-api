package br.com.itau.fllsouto.calculoseguro.domain.core.strategy;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InsuranceFeeInventory {
    
    // TODO: Consider a immutable list
    private List<InsuranceFeeStrategy> inventory;
     
    public InsuranceFeeInventory() {
        this.inventory = List.of(
            new AutoInsuranceFee
        )
    }
}
