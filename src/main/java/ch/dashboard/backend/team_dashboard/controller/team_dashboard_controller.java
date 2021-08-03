package ch.dashboard.backend.team_dashboard.controller;

import ch.dashboard.backend.team_dashboard.entities.Entry;
import ch.dashboard.backend.team_dashboard.services.ObjectivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/team_dashboard")
public class team_dashboard_controller {

    private final ObjectivesService objectivesService;

    @Autowired
    public team_dashboard_controller(ObjectivesService objectivesService) {
        this.objectivesService = objectivesService;
    }

    @GetMapping
    public List<Entry> getEntries(){
        return objectivesService.getEntries();
    }

    @GetMapping(path = "{firstName}")
    public List<Entry> getObjectiveByFirstName(@PathVariable("firstName") String firstName){
        return objectivesService.findByFirstName(firstName);
    }

    @GetMapping(path = "{LastName}")
    public List<Entry> getObjectiveByLastName(@PathVariable("lastName") String lastName){
        return objectivesService.findByLastName(lastName);
    }

    @GetMapping(path = "{objectiveName}")
    public List<Entry> getObjectiveByObjectiveName(@PathVariable("objectiveName") String objectiveName){
        return objectivesService.findByObjectiveName(objectiveName);
    }

    @GetMapping(path = "{objectiveStatus}")
    public List<Entry> getObjectiveByObjectiveStatus(@PathVariable("objectiveStatus") String objectiveStatus){
        return objectivesService.findByObjectiveStatus(objectiveStatus);
    }

    @GetMapping(path = "{objectiveType}")
    public List<Entry> getObjectiveByObjectiveType(@PathVariable("objectiveType") String objectiveType){
        return objectivesService.findByObjectiveStatus(objectiveType);
    }

    @PostMapping
    public void addNewEntry(@RequestBody Entry entry){
        objectivesService.addNewEntry(entry);
    }

    @DeleteMapping(path = "{entryId}")
    public void removeEntryById(@PathVariable("entryId") Long entryId){ objectivesService.removeEntry(entryId);}

    @DeleteMapping(path = "{deleteAllEntries}")
    public void removeAllEntry(){ objectivesService.removeAllEntries();}
}
