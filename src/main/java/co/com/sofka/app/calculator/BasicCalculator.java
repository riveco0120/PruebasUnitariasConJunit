package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger=LoggerFactory.getLogger(BasicCalculator.class);

    public Long suma(Long number1,Long number2){
        logger.info("Summing {} + {}",number1,number2);
        return number1+number2;
    }

    public Long resta(Long number1,Long number2){
        logger.info("Summing {} - {} ", number1,number2);
        return number1-number2;
    }

    public Long multiplicacion(Long number1, Long number2){
        logger.info("Summing {} * {} ", number1,number2);
        return number1*number2;
    }

    public Long divicion(Long number1,Long number2){
        logger.info("Summing {} / {}", number1,number2);
        Long resultado =0L;
        try {
            resultado = number1/number2;
        }catch (Exception e){
            System.out.println("Error no se puede dividir por cero");
        }
        return resultado;
    }


}
