package co.eagerapp.manuelro.eager.Structures.Cola;

/**
 * Created by JuanFélix on 3/12/2015.
 */
public class ColaMethods {
    Cola original;
    Cola secundaria;
    Cola colaFinal;

    public ColaMethods(){
        this.original = new Cola();
        secundaria = new Cola();
        colaFinal=new Cola();
    }


    public Object buscar(int position){
        Nodo temp = original.atiende();
        Object data=null;
        while(temp != null){
            if(temp.getPosition()==position)
                data = temp.getData();
            secundaria.enCola(temp);
            temp=original.atiende();
        }
        invertir();
        return data;
    }

    public void quitarUltimo(){
        Nodo temp = original.atiende();
        Nodo ultimo=null;
        while(temp.getPosition() <= 10){
            secundaria.enCola(temp);
            temp=original.atiende();
        }
        invertir();
    }



    public void eliminar(int position){
        if(position>original.size()) System.out.println("La posicion: "+position+" se encuentra vacia");
        else{
            Nodo temp = original.atiende();
            while(temp != null){
                if(temp.getPosition()!=position) secundaria.enCola(temp);
                temp=original.atiende();
            }
            invertir();
            checkLocations();
        }

    }

    public void agregar(Object data){
        original.enCola(new Nodo(data));

        if(checkLocations()>11){
            quitarUltimo();
        }


    }

    public void imprimir(){
        Nodo temp = original.atiende();
        while(temp != null){
            System.out.println(temp.getData());
            secundaria.enCola(temp);
            temp=original.atiende();
        }
        invertir();
    }

    /*********PRIVATES***********/
    private int checkLocations(){
        Nodo temp = original.atiende();
        int count=1;
        while(temp != null){
            temp.setPosition(count);
            count++;
            secundaria.enCola(temp);
            temp=original.atiende();
        }
        invertir();
        return count;
    }

    private void invertir(){
        Nodo temp = secundaria.atiende();
        while(temp != null){
            original.enCola(temp);
            temp=secundaria.atiende();
        }
    }
}
