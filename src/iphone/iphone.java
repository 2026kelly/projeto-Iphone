package iphone;

public class iphone {
    public static void main(String[] args) {       

    	NavegadorInternet navegacao = new NavegadorInternet("Site");
        navegacao.abrirSite("https://seja bem vindo ao site");

        AparelhoTelefonico telefone = new AparelhoTelefonico("+1 123-456-7890");
        telefone.fazerChamada();

       ReprodutorMusical player = new ReprodutorMusical();
        player.tocarMusica("alegria");
        player.pausarMusica();
    }
    
}
