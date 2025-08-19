package br.com.gestorfinanceiro.gestorfinanceiro.entity;

import br.com.gestorfinanceiro.gestorfinanceiro.dto.RegistroControleGastosDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "itens")
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoria;
    private String estabelecimento;
    private String produto;
    @Column(precision = 10, scale = 2)
    private BigDecimal preco;

    @Column(precision = 10, scale = 2)
    private BigDecimal quantidade;

    public static Item toEntity(RegistroControleGastosDTO dto) {
        Item item = new Item();
        item.setCategoria(dto.categoria());
        item.setEstabelecimento(dto.estabelecimento());
        item.setProduto(dto.produto());
        item.setPreco(dto.preco());
        item.setQuantidade(dto.quantidade());
        return item;
    }


}
