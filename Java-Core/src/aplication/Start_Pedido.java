package aplication;

import java.util.Date;

import collection.StatusPedido;
import entities.Pedido;

public class Start_Pedido {

	public static void main(String[] args) {
		
		// instanciar um novo objeto
		
		Pedido pedido1 = new Pedido(777, new Date(), StatusPedido.PENDENTE_DE_PAGAMENTO);
		
		System.out.println(pedido1);
		
		//Convertendo um objeto String em enum;
		// Instaância de pedido02, recebendo status de entregue
		StatusPedido pedido02 = StatusPedido.ENTREGUE;
		
		//StatusPedido pedido03 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(pedido02);
		//System.out.println(pedido03);
		
	}

}
