package config;

import com.example.dodo.service.DogService;
import com.example.dodo.service.serviceImp.DogServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;

@Configuration
public class TestConfig {

    @Bean
    public DogServiceImp dogServiceImp() {
        return new DogServiceImp();
    }

    @Bean
    public DogService dogService() {
        return mock(DogService.class);
    }

}
