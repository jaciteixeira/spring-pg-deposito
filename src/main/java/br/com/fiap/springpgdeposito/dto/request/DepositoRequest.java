package br.com.fiap.springpgdeposito.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DepositoRequest(

        @NotBlank(message = "O atributo nome é obrigatório")
        @NotNull(message = "O atributo nome é obrigatório")
        String nome,

        @NotNull(message = "Informe o endereço do depósito")
        EnderecoRequest endereco

) {
}
