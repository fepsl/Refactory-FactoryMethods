package Factory_Method;

public abstract class FactoryNotificacoes {
    public abstract IntNotificacoes criarNotificacao();

    public void enviarNotificacao() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
