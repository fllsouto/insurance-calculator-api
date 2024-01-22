package br.com.itau.fllsouto.calculoseguro.domain.usecases;

import br.com.itau.fllsouto.calculoseguro.domain.usecases.input.InsuranceProductInput;
import br.com.itau.fllsouto.calculoseguro.domain.usecases.output.InsuranceProductOutput;

public interface CalculateInsuranceFeeUseCase {
    
    public InsuranceProductOutput execute(InsuranceProductInput input);
    
}
