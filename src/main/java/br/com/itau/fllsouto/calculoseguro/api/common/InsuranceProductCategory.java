package br.com.itau.fllsouto.calculoseguro.api.common;

public enum InsuranceProductCategory {
    VIDA("VIDA"),
    AUTO("AUTO"),
    VIAGEM("VIAGEM"),
    RESIDENCIAL("RESIDENCIAL"),
    PATRIMONIAL("PATRIMONIAL");


    private String name;

    InsuranceProductCategory(String name) {
        this.name = name;
    }
}
