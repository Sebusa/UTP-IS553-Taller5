package ejercicio09.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import ejercicio09.clases.Diamante;

public class Ejercicio09Test {
    @DisplayName("Ejercicio 09")
    @ParameterizedTest()
    @CsvFileSource(resources = "datos.csv")
    void runTest(Integer n, String expectedAnswer) throws Exception{
        assertEquals(Boolean.parseBoolean(expectedAnswer),Diamante.generarDiamante(n));
    }
}
