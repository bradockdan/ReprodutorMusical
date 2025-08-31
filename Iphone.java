public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página da internet: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página atual.");
    }
}
