package ch.dashboard.backend.team_dashboard.repos;

import ch.dashboard.backend.team_dashboard.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface ObjectiveRepo extends JpaRepository<Entry, Long> {


    @Query("SELECT e FROM Entry e WHERE e.firstName = ?1")
    List<Entry> findByFirstName(String firstname);

    @Query("SELECT e FROM Entry e WHERE e.lastName = ?1")
    List<Entry> findByLastName(String lastname);


    @Query("SELECT e FROM Entry e WHERE e.objective = ?1")
    List<Entry> findByObjective(String objevtive);

    @Query("SELECT e FROM Entry e WHERE e.objectiveStatus = ?1")
    List<Entry> findByObjectiveStatus(String objevtive);

    @Query("SELECT e FROM Entry e WHERE e.objectiveType= ?1")
    List<Entry> findByObjectiveType(String objevtiveType);


}
