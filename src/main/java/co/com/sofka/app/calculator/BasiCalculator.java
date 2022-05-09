package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasiCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasiCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }


    public Long res(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 - number2;
    }


    public Long mul(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 * number2;
    }


    public Long div(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        long divicion =0;
        try{
            divicion=number1/number2;
            return divicion;
        }catch (Exception e){
            e.printStackTrace();
            return 0l;
        }

    }

}
