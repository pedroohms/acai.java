public class Banana extends BaseDecorator {
    private Tamanho tamanho;

    public Banana(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return wrappee.getDescricao() + " + Banana";
    }

    public double custo() {
        double adicional = 0;
        switch (tamanho) {
            case PEQUENO: adicional = 0.80; break;
            case MEDIO: adicional = 1.20; break;
            case GRANDE: adicional = 1.60; break;
        }
        return wrappee.custo() + adicional;
    }
}
