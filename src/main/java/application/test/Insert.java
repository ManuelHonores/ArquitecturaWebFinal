package application.test;

import application.entity.Hotel;
import application.entity.Plan;
import application.entity.Travel;
import application.entity.User;
import application.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* @SpringBootApplication
public class Insert {

    public static void main(String[] args) { SpringApplication.run(Insert.class, args); }

    @Bean
    public CommandLineRunner run(ExcursionRepository excursionRepository, FlyRepository flyRepository, HotelRepository hotelRepository, PlanRepository planRepository, TravelRepository travelRepository, UserRepository userRepository) throws Exception {
        return (String[] args) -> {
            User u1 = new User("Pablo", "p@gmail.com", "elloquito1887");
            Travel viaje1 = travelRepository.save(new Travel("boda", "Gualeguaychu", "AmericaSur", 1, 10, 2020, 12, 12, 2020, "viaje medio pelo", u1));
            Plan plan1 = new Plan("Museo", "4 horas recorriendo", false, "Gualeguaychu");
            Plan plan2 = new Hotel("Paraiso", "A 2 cuadras del centro", false, "Gualeguaychu", 1, 10, 2020, 10, 10, 2020);
        };
    }
} */

    @Configuration
    @Slf4j
    class TestInsert {
        @Bean
        CommandLineRunner initDatabase(@Qualifier("excursionRepository") ExcursionRepository repoExcursion,
                                       @Qualifier("flyRepository") FlyRepository repoFly,
                                       @Qualifier("hotelRepository") HotelRepository repoHotel,
                                       @Qualifier("planRepository") PlanRepository repoPlan,
                                       @Qualifier("travelRepository") TravelRepository repoTravel,
                                       @Qualifier("userRepository") UserRepository repoUser) {
            return args -> {
                User u1 = new User("Pablo", "p@gmail.com", "elloquito1887");
                Travel viaje1 = new Travel("boda", "Gualeguaychu", "AmericaSur", 1, 10, 2020, 12, 12, 2020, "viaje medio pelo", u1);
                Plan plan1 = new Plan("Museo", "4 horas recorriendo", false, "Gualeguaychu");
                Plan plan2 = new Hotel("Paraiso", "A 2 cuadras del centro", false, "Gualeguaychu", 1, 10, 2020, 10, 10, 2020);
                viaje1.addPlan(plan1);
                viaje1.addPlan(plan2);

                repoUser.save(u1);
                repoTravel.save(viaje1);
                repoPlan.save(plan1);
                repoPlan.save(plan2);
            };
        }
    }


