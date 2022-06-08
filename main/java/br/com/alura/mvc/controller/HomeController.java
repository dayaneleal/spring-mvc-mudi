package br.com.alura.mvc.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.model.Pedido;
import br.com.alura.mvc.repository.PedidoRepository;

@Controller
public class HomeController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
//		Pedido pedido = new Pedido();
//		pedido.setNomeProduto("Fire TV Stick Lite");
//		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41yI07Cs9UL._AC_SY450_.jpg");
//		pedido.setUrlProduto("https://www.amazon.com.br/Fire-TV-Stick-Lite/dp/B091G767YB/?_encoding=UTF8&pd_rd_w=aEuGj&content-id=amzn1.sym.7c0dc122-10ff-4c0d-8149-7512f9b1997a&pf_rd_p=7c0dc122-10ff-4c0d-8149-7512f9b1997a&pf_rd_r=VZJNFMQYTSRBFK9Y93NW&pd_rd_wg=lAPCI&pd_rd_r=8304e175-e448-41ab-8531-5bc14b7d0d7e&ref_=pd_gw_unk");
//		pedido.setDescricao("O Fire TV Stick Lite oferece tudo que você precisa para assistir a seus conteúdos favoritos de forma fácil. Aproveite streaming rápido, em Full HD e com inicialização rápida de aplicativos.");
//		
//		List<Pedido> pedidos = Arrays.asList(pedido);
		List<Pedido>pedidos = pedidoRepository.findAll();
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
