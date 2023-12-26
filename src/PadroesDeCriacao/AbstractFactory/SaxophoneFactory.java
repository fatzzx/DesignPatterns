package PadroesDeCriacao.AbstractFactory;

public class SaxophoneFactory implements InstrumentFactory{
    @Override
    public SoundSource createSoundSource() {
        return new VibrantAirColumn();
    }
    @Override
    public ExecutionTechnique createExecutionTechnique() {
        return new Embouchure();
    }
}
