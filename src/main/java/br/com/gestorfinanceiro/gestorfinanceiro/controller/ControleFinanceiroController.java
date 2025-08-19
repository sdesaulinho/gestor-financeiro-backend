package br.com.gestorfinanceiro.gestorfinanceiro.controller;

import br.com.gestorfinanceiro.gestorfinanceiro.dto.RegistroControleGastosDTO;
import br.com.gestorfinanceiro.gestorfinanceiro.entity.Item;
import br.com.gestorfinanceiro.gestorfinanceiro.mapper.RegistroControleGastosMapper;
import br.com.gestorfinanceiro.gestorfinanceiro.repository.ItemRepository;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1/controle-financeiro")
@RequiredArgsConstructor
public class ControleFinanceiroController {

    private final ItemRepository repository;

    @PostMapping
    @Operation(summary = "Salva na base de dados as informações da entrada do controle financeiro")
    public void salvarRegistroFinanceiro(RegistroControleGastosDTO request) {
        repository.save(Item.toEntity(request));
    }

    @GetMapping
    @Operation(summary = "Consulta todos os registros na base de dados")
    public List<RegistroControleGastosDTO> buscarTodos() {
        return repository.findAll().stream().map(RegistroControleGastosMapper::toDTO).toList();
    }
}
