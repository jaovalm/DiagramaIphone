package DiagramaIphone;

public class NavegadorInternet {
    private String url;

    public NavegadorInternet(String url) {
        this.url = url;
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página..." + url);
    }

    public void adicionarNovaAba (String url) {
        System.out.println("Adicionando nova aba..." + url);
    }

    public void atualizarPagina(String url) {
        System.out.println("Atualizando página " + url);
    }

}