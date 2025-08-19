package br.com.gestorfinanceiro.gestorfinanceiro.mapper;

import br.com.gestorfinanceiro.gestorfinanceiro.dto.RegistroControleGastosDTO;
import br.com.gestorfinanceiro.gestorfinanceiro.entity.Item;

public class RegistroControleGastosMapper {

    public static RegistroControleGastosDTO toDTO(Item item) {
        return RegistroControleGastosDTO.builder()
                .categoria(item.getCategoria())
                .estabelecimento(item.getEstabelecimento())
                .produto(item.getProduto())
                .preco(item.getPreco())
                .quantidade(item.getQuantidade())
                .build();
    }
}