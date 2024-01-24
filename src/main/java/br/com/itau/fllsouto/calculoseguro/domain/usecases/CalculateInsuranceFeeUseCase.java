package br.com.itau.fllsouto.calculoseguro.domain.usecases;

import br.com.itau.fllsouto.calculoseguro.domain.input.InsuranceProductInput;
import br.com.itau.fllsouto.calculoseguro.domain.output.InsuranceProductOutput;

public interface CalculateInsuranceFeeUseCase {
    
    public InsuranceProductOutput execute(InsuranceProductInput input);
    
}
