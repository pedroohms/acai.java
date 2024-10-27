public class LeiteCondensado extends BaseDecorator {
    private Tamanho tamanho;

    public LeiteCondensado(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return wrappee.getDescricao() + " + Leite Condensado";
    }

    public double custo() {
        double adicional = 0;
        switch (tamanho) {
            case PEQUENO: adicional = 1.20; break;
            case MEDIO: adicional = 1.70; break;
            case GRANDE: adicional = 2.20; break;
        }
        return wrappee.custo() + adicional;
    }
}
