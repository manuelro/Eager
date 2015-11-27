package co.eagerapp.manuelro.eager.Cycle;

import co.eagerapp.manuelro.eager.Cycle.Plain.CycleModel;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

/**
 * Created by JuanFélix on 27/11/2015.
 */
public class CycleMethods {
    private Lista cycles;
    public CycleMethods(){
        cycles = new Lista();
    }

    public void createCycle(int lenght){
        CycleModel creatingCycle = new CycleModel(lenght, cycles.CuentaNodos()+1);
        cycles.inserta(new Nodo(creatingCycle));
    }

    public void deleteCycle(int id){
        //
    }

    public void changeLenght(int id){

    }

    private boolean lengthExistst(int lenght){
        //
        return false;
    }
}
