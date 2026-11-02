package Factory_Method;

public class Main {
    public static void main(String[] args) {
        FactoryNotificacoes email = new FactoryEmail();
        email.enviarNotificacao();

        FactoryNotificacoes sms = new FactorySMS();
        sms.enviarNotificacao();
    }
}
