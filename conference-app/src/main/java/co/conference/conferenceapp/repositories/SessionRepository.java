package co.conference.conferenceapp.repositories;

import co.conference.conferenceapp.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

    //CRUD operations already implemented!!!

}
