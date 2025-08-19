package br.com.gestorfinanceiro.gestorfinanceiro.repository;

import br.com.gestorfinanceiro.gestorfinanceiro.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
