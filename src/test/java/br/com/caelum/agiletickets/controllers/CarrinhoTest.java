package br.com.caelum.agiletickets.controllers;

import junit.framework.Assert;

import org.junit.Test;


public class CarrinhoTest {
	
	@Test
	public void retornaMaiorCom1Produto(){
		Produto p = new Produto(10.0);
		Carrinho c = new Carrinho();
		c.adiciona(p);
		Assert.assertEquals(10.0, c.maiorProduto(), 0.01);
	}

	@Test
	public void retornaMaiorComNProduto(){
		Carrinho carrinho = new Carrinho();
		for (int i=0; i<10; i++) {
			Produto p = new Produto(i);
			carrinho.adiciona(p);
		}
		Assert.assertEquals(9.0, carrinho.maiorProduto(), 0.01);
	}

}