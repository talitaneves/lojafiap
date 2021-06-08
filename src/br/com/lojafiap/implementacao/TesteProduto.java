package br.com.lojafiap.implementacao;

import br.com.lojafiap.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
        Produto produto = new Produto();
		
		produto.setId(1);
		produto.setDescricao("CHURROS");
		produto.setQtde(15);
		produto.setValorCompra(5);
		produto.setValorVenda(10);
		
		System.out.println(produto.toString());
		System.out.println("Desconto 10%:" + produto.getDesconto());
		System.out.println("Desconto 20%:" + produto.getDesconto(20));
		System.out.println("Estoque: " + produto.getEstoque());
		produto.setAjustarValores(10);
		
		System.out.println("Após o aumento: ");
		System.out.println("Valor Venda: " + produto.getValorVenda());
		System.out.println("Valor Compra: " + produto.getValorCompra());
			
			
			
			

	}

}
