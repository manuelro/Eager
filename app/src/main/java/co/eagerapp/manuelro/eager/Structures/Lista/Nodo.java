package co.eagerapp.manuelro.eager.Structures.Lista;

/**
 * Created by Jose Pablo on 23/11/2015.
 */
public class Nodo {

    private Object data;
    private Nodo next;
    private Nodo back;

    public Nodo(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Nodo{" + "Data=" + data + '}'+"\n";
    }

}
