package ch.dashboard.backend.team_dashboard.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @SequenceGenerator
            (
                    name="id_sequence",
                    sequenceName = "id_sequence",
                    allocationSize = 1
            )
    @GeneratedValue
            (
                    strategy = GenerationType.SEQUENCE,
                    generator = "id_sequence"
            )
    Long id;
    String name;
    String team;
    String personal_number;
    String objective_name;
    String objective_description;
    double objective_completion; 

    public Employee(@NonNull String name, String team, String personal_number) {
        this.name = name;
        this.team = team;
        this.personal_number = personal_number;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPersonal_number() {
        return personal_number;
    }

    public void setPersonal_number(String personal_number) {
        this.personal_number = personal_number;
    }
}
