package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator= new BasicCalculator();

    @Test
    @DisplayName("Testing suma")
    void suma() {

        //Arrange
        Long number1=1L;
        Long number2=1L;
        Long expectedValue=2L;

        //Act
        Long result =basicCalculator.suma(number1,number2);

        //Assert
        assertEquals(expectedValue,result);

    }



}
