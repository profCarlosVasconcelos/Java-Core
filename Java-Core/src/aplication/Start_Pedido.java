package aplication;

import java.util.Date;

import collection.StatusPedido;
import entities.Pedido;

public class Start_Pedido {

	public static void main(String[] args) {
		
		// instanciar um novo objeto
		
		Pedido pedido1 = new Pedido(777, new Date(), StatusPedido.PROCESSANDO);
		
		System.out.println(pedido1);
		
		// é importante porque no scanner o tipo é String e não enum
		// Convertendo um objeto String em enum;
		// Instância de pedido02, recebendo status de entregue
		StatusPedido pedido02 = StatusPedido.ENTREGUE;
		
		StatusPedido pedido03 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(pedido02);
		System.out.println(pedido03);
	}

}
