package ejercicio08.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import ejercicio08.clases.Conversor;
import ejercicio08.clases.InvalidNumberException;

public class Ejercicio08Test {
    @DisplayName("Ejercicio 08")
    @ParameterizedTest()
    @CsvFileSource(resources = "datos.csv")
    void runTest(String hexadecimal, Integer expectedAnswer) throws InvalidNumberException{
        var ejemplo = new Conversor(hexadecimal); 
        ejemplo.convertirNúmero();
        assertEquals(expectedAnswer, ejemplo.getDecimal());
    }
}
