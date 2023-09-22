package DiagramaIphone;

public class AparelhoTelefonico {
    private String numero;

    public AparelhoTelefonico(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void ligar(String numero) {
        System.out.println("Ligando... " + numero);
    }

    public void atender(String numero) {
        System.out.println("Atendendo...");
    }

    public void IniciarCorreioVoz(String numero) {
        System.out.println("Iniciando correio de voz...");
    }




}
