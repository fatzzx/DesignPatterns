package PadroesDeCriacao.Builder;

public class Client {

    public static void main(String[] args){
        Pokemon pokemon = PokemonBuilder
                .builder()
                .withHeight(0.70)
                .withId(4)
                .withName("charmander")
                .withRandomClassification()
                .withWeight(20.0)
                .withRandomLife()
                .build();
        System.out.println(pokemon);
    }
}
