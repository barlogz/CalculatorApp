package ua.goit.java.calculator.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.goit.java.calculator.lib.Calculator;
import ua.goit.java.calculator.lib.CalculatorFactory;

/**
 * Created by Roman D. on 28.07.2016.
 */
@Configuration
public class AppConfig {

    @Bean
    Main main(Calculator calculator) {
        Main main = new Main();
        main.setCalculator(calculator);
        return main;
    }

    @Bean
    Calculator newCalculator() {
        return CalculatorFactory.getCalculator();
    }
}
