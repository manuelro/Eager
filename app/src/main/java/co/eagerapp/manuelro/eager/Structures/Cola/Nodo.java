package co.eagerapp.manuelro.eager.Structures.Cola;

/**
 * Created by JuanFélix on 3/12/2015.
 */
public class Nodo {
    private Object Data;
    private int position;
    private Nodo atras;

    public Nodo(Object Data){
        this.Data=Data;
    }

    @Override
    public String toString(){
        return ""+getData();
    }
    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
