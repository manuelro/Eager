package co.eagerapp.manuelro.eager.Structures.Arbol;

/**
 * Created by pablo on 12/3/15.
 */
public class Arbol {

    private Nodo raiz;

    public void inOrden() {
        if (raiz != null) {
            inOrdenR(raiz);
        } else {
            System.out.println("El arbol esta vacio");
        }
    }

    public void inOrdenR(Nodo n) {
        if (n != null) {
            inOrdenR(n.getHijoIzq());
            System.out.print("" + n.getId());
            inOrdenR(n.getHijoDer());

        }
    }

    public void insert(int num) {
        if (raiz == null) {
            raiz = new Nodo(num);
        } else {
            insertR(raiz, num);
        }

    }

    public void insertR(Nodo n, int num) {
        if (num <= n.getId()) {
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new Nodo(num));
            } else {
                insertR(n.getHijoIzq(), num);
            }
        } else {
            if (n.getHijoDer() == null) {
                n.setHijoDer(new Nodo(num));
            } else {
                insertR(n.getHijoDer(), num);
            }
        }
    }

    public boolean validate(int num) {

        boolean validation = false;
        Nodo aux = raiz;
        if (aux != null) {
            validation = validateR(aux, num);
        }
        return validation;
    }

    public boolean validateR(Nodo n, int num) {
        boolean validation = false;
        if (n != null) {
            if (num == n.getId()) {
                validation = true;
            } else if (num < n.getId()) {
                validation = validateR(n.getHijoIzq(), num);
            } else if (num > n.getId())
                validation = validateR(n.getHijoDer(), num);
        } return validation;
    }

}
