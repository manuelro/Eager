package co.eagerapp.manuelro.eager.Structures.Arbol;

/**
 * Created by pablo on 12/3/15.
 */
public class Nodo {

    private Object data;
    private int id;
    private Nodo hijoDer;
    private Nodo hijoIzq;

    public Nodo(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return ""+getData();
    }
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }
}
