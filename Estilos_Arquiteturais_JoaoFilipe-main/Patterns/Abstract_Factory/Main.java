package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        Aplicacao android = new Aplicacao(new FabricaAndroid());
        android.renderizar();

        Aplicacao ios = new Aplicacao(new FabricaIOS());
        ios.renderizar();
    }
}
