package vn.edu.iuh.fit;

import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.models.User;
import vn.edu.iuh.fit.repositories.UserRepository;

import java.util.Locale;

@SpringBootApplication
public class UserApplication {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    CommandLineRunner test(){
        return args -> {
            Faker faker = new Faker(new Locale("vi","VN"));
            for (int i=1; i<=10; i++) {
                User user = new User(faker.name().name());
                userRepository.save(user);
            }
        };
    }
}
