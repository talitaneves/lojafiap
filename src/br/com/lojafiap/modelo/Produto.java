package br.com.lojafiap.modelo;


/*
 * Design Pattern: compilado de boas praticas para orientação a objetos
 * um dos patters é o DTO (indica a melhor forma de representar uma classe modelo
 * (do diagrama de classe) dentro da programação
 * - Todos os atributos devem ser privados
 * - Cada atributo deve possuir individualmente os metodos getters(OUTPUT) e setters(INPUT)
 * 
 * COLOCO O CURSOR EMBAIXO DE TODOS OS ATRIBUTOS
 * VOU EM SOURCE, GENERATE GETTERS AND SETTERS
 * 
 * 
 * modelo = beans = JavaBeans = model = dto
 * 
 */


public class Produto {
	
	private int id;
	private String descricao;
	private double valorVenda;
	private double valorCompra;
	private int qtde;
	
	//public String toString() {
		
	//	return
	//	        "ID............................: " + id + "\n" +
	//			"Descrição.....................: " + descricao + "\n" +
	//			"Valor Venda...................: " + valorVenda + "\n" +
	//			"Valor Compra..................: " + valorCompra + "\n" +
	//			"Quantidade....................: " + qtde;
		        
	//}
	
	
	
	
	
        public double getDesconto() {
		
		double auxValor = valorVenda * 0.9;
		
        	return auxValor;	        
	}
	
	
        
        @Override
		public String toString() {
			return "Produto [id=" + id + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCompra="
					+ valorCompra + ", qtde=" + qtde + "]";
		}



		public double getDesconto(double porc) {
    		
			return valorVenda - valorVenda * (porc/100);
    		  
    	}
        
        
        public void setAjustarValores(double porc) {
    		
    		valorVenda = valorVenda + valorVenda * (porc/100);
    		valorCompra = valorCompra + valorCompra * (porc/100);
 
                 
    	}


        public String getEstoque() {
    		
    		if(qtde > 20) {
    			return "Estoque alto";
    			
    		}else if(qtde < 10){
    			return "Estoque baixo";
    			
    		}else {
    		 	return "Estoque médio";
    			
    		}
    			
    		}
                 
    	

        
        
	
	//output 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValorVenda() {
		return valorVenda;
	}


	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}


	public double getValorCompra() {
		return valorCompra;
	}


	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}


	public int getQtde() {
		return qtde;
	}


	public void setQtde(int qtde) {
		this.qtde = qtde;
	}	
	

}
