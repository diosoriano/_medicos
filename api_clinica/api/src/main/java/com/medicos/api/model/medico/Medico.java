package com.medicos.api.model.medico;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Medico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private String endereco;
}
