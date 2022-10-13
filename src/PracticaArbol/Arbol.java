package PracticaArbol;

public abstract class Arbol implements IArbol {
    public Arbol() {
    }

    @Override
    public boolean soyRama() {
        return false;
    }

    @Override
    public boolean soyTronco() {
        return false;
    }



}
