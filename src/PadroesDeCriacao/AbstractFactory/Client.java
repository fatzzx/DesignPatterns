package PadroesDeCriacao.AbstractFactory;

public class Client {
    public static InstrumentFactory createFactory(String type){
        InstrumentFactory instrumentFactory = null;
        switch (type){
            case "guitar":
                instrumentFactory = new GuitarFactory();
                break;
            case "saxophone":
                instrumentFactory = new SaxophoneFactory();

            default:
                break;
        }
        return instrumentFactory;
    }
    public static Instrument createInstrument(InstrumentFactory instrumentFactory){
        Instrument instrument = new Instrument();
        instrument.setSoundSource(instrumentFactory.createSoundSource());
        instrument.setExecutionTechnique(instrumentFactory.createExecutionTechnique());
        return instrument;
    }
    public static void main(String[] args){
        Instrument guitar, saxophone;
        guitar = createInstrument(createFactory("guitar"));
        saxophone = createInstrument(createFactory("saxophone"));
        System.out.println(guitar.getExecutionTechnique().executionTechnique());
        System.out.println(saxophone.getExecutionTechnique().executionTechnique());
    }
}
