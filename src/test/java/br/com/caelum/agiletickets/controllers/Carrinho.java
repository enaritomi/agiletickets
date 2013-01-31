package br.com.caelum.agiletickets.controllers;

public class Carrinho {

	private Produto produto;

	public void adiciona(Produto p) {
		if (this.produto == null) {
			this.produto = p;
		} else {
		
			if (this.produto.getPreco() < p.getPreco()) {
				this.produto = p;
			}

		}
	}

	public double maiorProduto() {
		return this.produto.getPreco();
	}

}
