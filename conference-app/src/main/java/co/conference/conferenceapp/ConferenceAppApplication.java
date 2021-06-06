package co.conference.conferenceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceAppApplication {

	/*For creating package, use maven command:
	mvn package spring-boot:repackage
	 */

	public static void main(String[] args) {
		SpringApplication.run(ConferenceAppApplication.class, args);
	}

}
