package PadroesDeCriacao.Builder;
import java.util.Random;

public class PokemonBuilder {

    private final Pokemon pokemon;
    private final Random random;

    private PokemonBuilder(){
        pokemon = new Pokemon();
        random = new Random();
    }

    public static PokemonBuilder builder(){
        return new PokemonBuilder();
    }

    public PokemonBuilder withName(String name) {
        pokemon.setName(name);
        return this;
    }

    public PokemonBuilder withHeight(Double height) {
        pokemon.setHeight(height);
        return this;
    }

    public PokemonBuilder withWeight(Double weight) {
        pokemon.setWeight(weight);
        return this;
    }

    public PokemonBuilder withId(Integer id) {
        pokemon.setId(id);
        return this;
    }

    public PokemonBuilder withRandomLife() {
        int randomLife = random.nextInt(100) + 1;
        pokemon.setLife(randomLife);
        return this;
    }

    public PokemonBuilder withRandomClassification() {
        int randomClassification = random.nextInt(100) + 1;
        pokemon.setClassification(randomClassification);
        return this;
    }

    public Pokemon build(){
        return this.pokemon;
    }
}
