package PadroesDeCriacao.AbstractFactory;

public class Instrument {
    private SoundSource soundSource;
    private ExecutionTechnique executionTechnique;

    public SoundSource getSoundSource() {
        return soundSource;
    }

    public void setSoundSource(SoundSource soundSource) {
        this.soundSource = soundSource;
    }

    public ExecutionTechnique getExecutionTechnique() {
        return executionTechnique;
    }

    public void setExecutionTechnique(ExecutionTechnique executionTechnique) {
        this.executionTechnique = executionTechnique;
    }
}
