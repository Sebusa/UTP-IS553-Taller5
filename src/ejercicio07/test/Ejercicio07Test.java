package ejercicio07.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ejercicio07.clases.MyMath;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio07Test {
    @DisplayName("Ejercicio 07")
    @ParameterizedTest()
    @CsvFileSource(resources = "minimo.csv")
    void runTest01(String inputLista, Integer minNumber){
        var ejemplo = new MyMath();
        List<Integer> lista = new ArrayList<>();
   
        for(String n : inputLista.split(",")){
            lista.add(Integer.parseInt(n));
        }

        assertEquals(minNumber, ejemplo.min(lista));
    }

    @ParameterizedTest()
    @CsvFileSource(resources = "maximo.csv")
    void runTest02(String inputLista, Integer maxNumber){
        var ejemplo = new MyMath();
        List<Integer> lista = new ArrayList<>();
   
        for(String n : inputLista.split(",")){
            lista.add(Integer.parseInt(n));
        }

        assertEquals(maxNumber, ejemplo.max(lista));
    }
}
