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

    @DisplayName("Testin several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,1",
            "1,2,3",
            "49, 51,100",
            "1, 100, 101"
    })
   public void voidSumaVariosCasos(Long first, Long second,Long expextedResult){
        assertEquals(expextedResult,basicCalculator.suma(first,second),
                ()->first + " + " + second + " should equal " + expextedResult);

    }

    @Test
    @DisplayName("Testing resta")
    void resta() {

        //Arrange
        Long number1=1L;
        Long number2=1L;
        Long expectedValue=0L;

        //Act
        Long result =basicCalculator.resta(number1,number2);

        //Assert
        assertEquals(expectedValue,result);

    }


    @DisplayName("Testin several resta")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,2,-1",
            "49, 51,-2",
            "1, 100, -99"
    })
    public void voidResta(Long first, Long second,Long expextedResult){
        assertEquals(expextedResult,basicCalculator.resta(first,second),
                ()->first + " - " + second + " should equal " + expextedResult);

    }

    @Test
    @DisplayName("Testin Multiplicacion")
    public void multiplicacion(){
        //Arrange
        Long number1=1L;
        Long number2=2L;
        Long expectedValue=2L;
        //Act
        Long result = basicCalculator.multiplicacion(number1,number2);

        //Assert
        assertEquals(expectedValue,result);
    }

    @DisplayName("Testin several multiplicacion")
    @ParameterizedTest(name ="{0}+{1}={2}")
    @CsvSource({
            "2,2,4",
            "1,2,2",
            "50,2,100",
            "10,100,1000"
    })
    public void voidMultiplicacion(Long first,Long second,Long expextedResult){
        assertEquals(expextedResult, basicCalculator.multiplicacion(first,second),
                ()-> first + " * " + second + "should equal" + expextedResult);
    }

    @DisplayName("Testin divicion")
    @Test
    public void divicion(){
        //Arrange

        Long number1=2L;
        Long number2=1L;
        Long expextedResult=2L;

        //Act

        Long result = basicCalculator.divicion(number1,number2);

        //Assert

        assertEquals(expextedResult,result);


    }

    @DisplayName("Testin severe divicion")
    @ParameterizedTest(name = "{0}+{1}={2}")
    @CsvSource({
            "2,2,1",
            "10,2,5",
            "75,3,25",
            "100,10,10"
    })
    public void voidDivicion(Long first,Long second,Long expextedResult){
        assertEquals(expextedResult,basicCalculator.divicion(first,second),
                ()->first + " / " + second + "should equal"+expextedResult);

    }


}

