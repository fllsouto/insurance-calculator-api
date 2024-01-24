package br.com.itau.fllsouto.calculoseguro.domain.usecases;

import org.springframework.stereotype.Component;

import br.com.itau.fllsouto.calculoseguro.domain.input.InsuranceProductInput;
import br.com.itau.fllsouto.calculoseguro.domain.output.InsuranceProductOutput;

@Component
public class CalculateInsuranceFeeUseCaseImpl implements CalculateInsuranceFeeUseCase {

    @Override
    public InsuranceProductOutput execute(InsuranceProductInput input){
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }
    
    
}
