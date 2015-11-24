package co.eagerapp.manuelro.eager.Structures.Lista;

import android.app.Activity;

import co.eagerapp.manuelro.eager.Activity.Activities;
import co.eagerapp.manuelro.eager.Structures.Nodo;

/**
 * Created by Manuel on 19/11/2015.
 */
public class Lista {

    Nodo cabeza;
    Nodo ultimo;
    int CantidadNodos;
    public void inserta(Activities a){
        Nodo aux=cabeza;
        if(cabeza==null){ //si la lista esta vacia
            cabeza=new Nodo(a); //guardo el nodo
            ultimo=cabeza;
            ultimo.setNext(cabeza);
        }else if(aux!=null){
            ultimo.setNext(new Nodo(a));//creo el nodo como siguiente del ultimo
            ultimo=ultimo.getNext();//actualizo ultimo
            ultimo.setNext(cabeza);//enlazo ultimo y cabeza
        }
    }
    public int CuentaNodos() {
        CantidadNodos = 1;
        try{

            Nodo aux=cabeza;
            aux=aux.getNext();
            CuentaNodosRec(aux);

        }catch(NullPointerException ex){
            return 0;
        };

        return CantidadNodos;
    }

    private void CuentaNodosRec(Nodo N) {
        if (N != cabeza) {
            CantidadNodos++;
            CuentaNodosRec(N.getNext());
        }
    }

    @Override
    public String toString(){
        Nodo aux = cabeza;
        String s = "Lista: \n";
        if(aux != null){
            s += aux+"";//agrego la cabeza
            aux = aux.getNext();//avanzo
            while(aux != cabeza){//cuando sea cabeza otra vez
                s += aux+"";//se detiene
                aux = aux.getNext();
            }
        }else{
            s +="vacia";
        }
        return s;
    }

    public void EliminaN(int n){
        Nodo aux=cabeza;
        try{
            if(n==1){
                ultimo.setNext(aux.getNext());
                aux.getNext().setBack(ultimo);
                cabeza=aux.getNext();
                System.out.println("Eliminado: "+n);
            }else if(n!=1){
                int x=2;
                while(cabeza!=aux.getNext()){
                    if(n==x){
                        aux.setNext(aux.getNext().getNext());
                        System.out.println("Eliminado: "+n);
                    }
                    aux=aux.getNext();
                    x++;
                }
            }
            if(n>CuentaNodos()){
                System.out.println("Eliminado: null, valor "+n+" no se encuentra");
            }
        }catch(NullPointerException e){
            System.out.println("Vacia");
        }
    }

}
