package io.github.lucasmss.agendaapi.model.repository;

import io.github.lucasmss.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
