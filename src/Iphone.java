
public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina: " + url);
		
	}


	public void adicionarNovaAba() {
		System.out.println("Adicionando aba...");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}


	public void tocar() {
		System.out.println("Tocando...");
		
	}


	public void pausar() {
		System.out.println("Pausando...");
		
	}


	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica);
		
	}


	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
		
	}


	public void atender() {
		System.out.println("Atendendo...");
		
	}


	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
		
	}

}
