public class TesteDecorator {
    public static void main(String[] args) {
        
        Adicional acaiMedio = new Acai(Tamanho.MEDIO);
        System.out.println(acaiMedio.getDescricao() + " custa R$ " + acaiMedio.custo());

        Adicional acaiComMorango = new Morango(acaiMedio, Tamanho.MEDIO);
        System.out.println(acaiComMorango.getDescricao() + " custa R$ " + acaiComMorango.custo());

        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(new Acai(Tamanho.GRANDE), Tamanho.GRANDE), Tamanho.GRANDE), Tamanho.GRANDE);
        System.out.println(acaiCompleto.getDescricao() + " custa R$ " + acaiCompleto.custo());
    }
}
