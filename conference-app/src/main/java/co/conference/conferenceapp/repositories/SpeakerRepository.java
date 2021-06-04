package co.conference.conferenceapp.repositories;

import co.conference.conferenceapp.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

    //CRUD operations implemented with this extends!!

}
