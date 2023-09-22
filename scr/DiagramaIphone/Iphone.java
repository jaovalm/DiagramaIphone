package DiagramaIphone;

public class Iphone { 

    public static void main(String[] args) {
                
        AparelhoTelefonico aparelho = new AparelhoTelefonico(null);
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        NavegadorInternet navegador = new NavegadorInternet(null);

        aparelho.ligar("123456789");
        aparelho.atender("123456789");
        aparelho.IniciarCorreioVoz("123456789");

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba("www.google.com");  
        navegador.atualizarPagina("www.google.com");

    }
  




    
     

}
