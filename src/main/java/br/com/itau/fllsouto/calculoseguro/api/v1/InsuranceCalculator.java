package br.com.itau.fllsouto.calculoseguro.api.v1;

import org.springframework.web.bind.annotation.RestController;

import br.com.itau.fllsouto.calculoseguro.api.input.InsuranceProductRequest;
import br.com.itau.fllsouto.calculoseguro.api.output.InsuranceProductResponse;
import br.com.itau.fllsouto.calculoseguro.domain.usecases.CalculateInsuranceFeeUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/v1/insurance_calculator")
public class InsuranceCalculator {

    @Autowired
    private CalculateInsuranceFeeUseCase calculateInsuranceFeeUseCase;
    
    @PostMapping(path = "calculate")
    public InsuranceProductResponse calculate(@RequestBody InsuranceProductRequest request) {
        var useCaseInput = request.toInput(); // TODO: Should I invert the dependency direction?
        var useCaseOutput = calculateInsuranceFeeUseCase.execute(useCaseInput);
        return useCaseOutput.toResponse();
    }
}
