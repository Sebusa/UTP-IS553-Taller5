package ejercicio07.clases;

import java.util.Collections;
import java.util.List;

public final class MyMath implements Extremos<Integer>{

    @Override
    public Integer min(List<Integer> lista){
        Collections.sort(lista);
        return (Integer) lista.get(0);
    }

    @Override
    public Integer max(List<Integer> lista){
        Collections.sort(lista);
        return (Integer) lista.get(lista.size()-1);
    }
}
