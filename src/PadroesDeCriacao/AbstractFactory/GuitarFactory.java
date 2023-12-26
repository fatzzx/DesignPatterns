package PadroesDeCriacao.AbstractFactory;

public class GuitarFactory implements InstrumentFactory{
    @Override
    public ExecutionTechnique createExecutionTechnique() {
        return new GuitarPick();
    }
    @Override
    public SoundSource createSoundSource() {
        return new VibrantStrings();
    }
}
