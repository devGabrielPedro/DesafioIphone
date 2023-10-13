package br.edu.dio.main;

import br.edu.dio.model.AparelhoEletronico;
import br.edu.dio.model.NavegadorInternet;
import br.edu.dio.model.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoEletronico, NavegadorInternet {

	private String musicaAtual;
    private String paginaAtual;
	
	@Override
    public void tocar() {
        System.out.println("Tocando musica: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
    	this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado!");
    }

    @Override
    public void exibirPagina(String url) {
    	this.paginaAtual = url;
        System.out.println("Exibindo página: " + paginaAtual);
    }

    @Override
    public void adicionarNovaAba() {
    	System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
    	System.out.println("Página atualizada");
    }
    
    public static void main(String[] args) {
        // Criando uma instância de IPhone
        IPhone iphone = new IPhone();

        // Testando as funcionalidades de Reprodutor Musical
        iphone.selecionarMusica("Musica 1");
        iphone.tocar();
        iphone.pausar();
        System.out.println();
        
        // Testando as funcionalidades de Aparelho Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();
        
        // Testando as funcionalidades de Navegador na Internet
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
    }
	
}
