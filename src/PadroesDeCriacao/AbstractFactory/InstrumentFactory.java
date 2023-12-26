package PadroesDeCriacao.AbstractFactory;

public interface InstrumentFactory {
    ExecutionTechnique createExecutionTechnique();
    SoundSource createSoundSource();
}
