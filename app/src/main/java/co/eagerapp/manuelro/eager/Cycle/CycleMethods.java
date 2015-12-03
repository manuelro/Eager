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

    public void createCycle(int length){
        CycleModel creatingCycle = new CycleModel(length, cycles.CuentaNodos()+1);
        cycles.inserta(new Nodo(creatingCycle));
    }

    public void deleteCycle(int id){
        for(int x = 0; x<cycles.CuentaNodos(); x++){
            CycleModel tempCycle=(CycleModel)cycles.get(x);
            if(tempCycle.getId()==id){
                cycles.EliminaN(x);
                break;
            }
        }
    }

    public void changeLenght(int id, int newLength){
        for(int x = 0; x<cycles.CuentaNodos(); x++){
            CycleModel tempCycle=(CycleModel)cycles.get(x);
            if(tempCycle.getId()==id){
                tempCycle.setLenght(newLength);
                break;
            }
        }
    }

    private boolean lengthExistst(int lenght){
        //
        return false;
    }
}
