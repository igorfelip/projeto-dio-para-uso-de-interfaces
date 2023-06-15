public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para: ");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada de: ");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }
}
