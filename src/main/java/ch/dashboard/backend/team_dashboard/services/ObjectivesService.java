package ch.dashboard.backend.team_dashboard.services;

import ch.dashboard.backend.team_dashboard.entities.Entry;
import ch.dashboard.backend.team_dashboard.repos.ObjectiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ObjectivesService {

    private final ObjectiveRepo objectiveRepo;

    @Autowired
    public ObjectivesService(ObjectiveRepo objectiveRepo) {
        this.objectiveRepo = objectiveRepo;
    }

    public List<Entry> getEntries(){ return objectiveRepo.findAll();}

    public List<Entry> findByFirstName(String firstName){
        return objectiveRepo.findByFirstName(firstName);
    }

    public List<Entry> findByLastName(String firstName){
        return objectiveRepo.findByLastName(firstName);
    }


    public List<Entry> findByObjectiveName(String firstName){
        return objectiveRepo.findByObjective(firstName);
    }

    public List<Entry> findByObjectiveStatus(String firstName){
        return objectiveRepo.findByObjectiveStatus(firstName);
    }

    public List<Entry> findByObjectiveType(String firstName){
        return objectiveRepo.findByObjectiveType(firstName);
    }

    public void addNewEntry(Entry entry){objectiveRepo.saveAndFlush(entry);}

    public void removeEntry(Long entryId) {
        objectiveRepo.deleteById(entryId);
    }

    public void removeAllEntries() {
        objectiveRepo.deleteAll();
    }

}
