package com.pedido.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedido.demo.model.Pedido;
import com.pedido.demo.model.PedidoRequest;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@PostMapping
	public Pedido criarPedido(@RequestBody PedidoRequest request) {
        Pedido pedido = new Pedido.Builder()
            .id(request.getId())
            .produto(request.getProduto())
            .quantidade(request.getQuantidade())
            .valorTotal(request.getValorTotal())
            .build();

        return pedido;
    }

}
