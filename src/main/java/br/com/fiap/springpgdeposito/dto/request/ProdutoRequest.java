package br.com.fiap.springpgdeposito.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record ProdutoRequest(


        @Size(min = 5, max = 255)
        @NotNull(message = "O nome do produto é obrigatório")
        String nome,

        @Size(min = 10, max = 255)
        @NotNull(message = "A descrição do produto é obrigatória")
        String descricao,

        @Min(0)
        @NotNull(message = "O valor do produto é obrigatório")
        BigDecimal valor

) {
}
