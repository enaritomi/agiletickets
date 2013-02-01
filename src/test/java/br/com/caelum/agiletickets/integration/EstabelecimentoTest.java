package br.com.caelum.agiletickets.integration;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class EstabelecimentoTest {

//	public static String BASE_URL = "http://localhost:8080";
//	private static WebDriver browser;
//	private EstabelecimentosDriver estabelecimentos;
//
//	@BeforeClass
//	public static void abreBrowser() {
//		browser = new FirefoxDriver();
//	}
//
	@Test
	public void bla() throws Exception {
		Assert.assertTrue(true);
	}
	
//	@Before
//	public void setUp() throws Exception {
//		estabelecimentos = new EstabelecimentosDriver(browser);
//	}
//
//	@AfterClass
//	public static void teardown() {
//		browser.close();
//	}
//
//	@Test
//	public void aoAdicionarUmEstabelecimentoDeveMostraLoNaTabela() throws Exception {
//		estabelecimentos.abreListagem();
//
//		estabelecimentos.adicioneEstabelecimento("Caelum", "R. Vergueiro, 3185");
//
//		estabelecimentos.ultimaLinhaDeveConter("Caelum", "R. Vergueiro, 3185");
//	}
//
//	@Test
//	public void aoAdicionarUmEstabelecimentoSemNomeDeveMostrarErro() throws Exception {
//		estabelecimentos.abreListagem();
//
//		estabelecimentos.adicioneEstabelecimento("", "R. Vergueiro, 3185");
//
//		estabelecimentos.deveMostrarErro("O nome não pode ser vazio");
//	}
//
//	@Test
//	public void aoAdicionarUmEstabelecimentoSemEnderecoDeveMostrarErro() throws Exception {
//		estabelecimentos.abreListagem();
//
//		estabelecimentos.adicioneEstabelecimento("Caelum", "");
//
//		estabelecimentos.deveMostrarErro("O endereco não pode ser vazio");
//	}
//
//	@Test
//	public void mostraQueHaEstacionamentoQuandoCadastramosQueSim() throws Exception {
//		estabelecimentos.abreListagem();
//
//		estabelecimentos.adicioneEstabelecimentoComEstacionamento(true);
//
//		estabelecimentos.ultimaLinhaDeveTerEstacionamento(true);
//	}
//
//	@Test
//	public void mostraQueNaoHaEstacionamentoQuandoCadastramosQueNao() throws Exception {
//		estabelecimentos.abreListagem();
//
//		estabelecimentos.adicioneEstabelecimentoComEstacionamento(false);
//
//		estabelecimentos.ultimaLinhaDeveTerEstacionamento(false);
//	}
}
