package PracticaArbol;

public class Rama extends Tronco{

    public Rama() {
    }

    @Override
    public boolean soyRama() {
        return true;
    }

    @Override
    public boolean soyTronco() {
        return false;
    }

}
