package br.com.alura.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.mvc.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	public List<Pedido> findAll();
}
