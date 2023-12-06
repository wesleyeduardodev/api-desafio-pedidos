package br.com.desafio.pedidos.configuration;
import br.com.desafio.pedidos.enums.EnvironmentTypes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvironmentConfiguration {

    @Value(value = "${enviroment.type}")
    private String enviromentType;

    @Bean
    public EnvironmentTypes getEnvironmentType() {
        EnvironmentTypes environmentTypes;
        if (enviromentType.equalsIgnoreCase("TEST")) {
            environmentTypes = EnvironmentTypes.TEST;
        } else if (enviromentType.equalsIgnoreCase("DEV")) {
            environmentTypes = EnvironmentTypes.DEV;
        } else {
            environmentTypes = EnvironmentTypes.PROD;
        }
        return environmentTypes;
    }
}
