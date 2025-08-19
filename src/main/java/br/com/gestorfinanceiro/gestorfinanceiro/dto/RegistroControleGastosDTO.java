package br.com.gestorfinanceiro.gestorfinanceiro.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record RegistroControleGastosDTO(String categoria,
                                        String estabelecimento,
                                        String produto,
                                        BigDecimal preco,
                                        BigDecimal quantidade) {
}
