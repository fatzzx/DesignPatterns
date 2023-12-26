package PadroesDeCriacao.AbstractFactory;

public class VibrantStrings implements SoundSource{

    @Override
    public String soundSource() {
        return "Also called vibrating strings," +
                " the strings of musical instruments, when they vibrate, produce transverse waves that," +
                " superimposed on those reflected at the ends, create a standing wave.";
    }

}
