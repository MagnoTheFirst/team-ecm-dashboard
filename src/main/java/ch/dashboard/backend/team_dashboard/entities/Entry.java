package ch.dashboard.backend.team_dashboard.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Entry {

    @Id
    @SequenceGenerator(
            name="objective_sequence",
            sequenceName = "objective_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy=GenerationType.SEQUENCE,
            generator="objective_sequence"
    )
    Long id;


    String firstName;
    String lastName;
    String objective;
    double achievment;
    String objectiveType;
    LocalDate objectiveDeadline;
    boolean objectiveStatus;
    String comment;

    public Entry() {

    }

    public Entry(String firstName, String lastName, String objective, double achievment, String objectiveType, LocalDate objectiveDeadline, boolean objectiveStatus, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.objective = objective;
        this.achievment = achievment;
        this.objectiveType = objectiveType;
        this.objectiveDeadline = objectiveDeadline;
        this.objectiveStatus = objectiveStatus;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public double getAchievment() {
        return achievment;
    }

    public void setAchievment(double achievment) {
        this.achievment = achievment;
    }

    public String getObjectiveType() {
        return objectiveType;
    }

    public void setObjectiveType(String objectiveType) {
        this.objectiveType = objectiveType;
    }

    public LocalDate getObjectiveDeadline() {
        return objectiveDeadline;
    }

    public void setObjectiveDeadline(LocalDate objectiveDeadline) {
        this.objectiveDeadline = objectiveDeadline;
    }

    public boolean isObjectiveStatus() {
        return objectiveStatus;
    }

    public void setObjectiveStatus(boolean objectiveStatus) {
        this.objectiveStatus = objectiveStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", objective='" + objective + '\'' +
                ", achievment=" + achievment +
                ", objectiveType='" + objectiveType + '\'' +
                ", objectiveDeadline=" + objectiveDeadline +
                ", objectiveStatus=" + objectiveStatus +
                ", comment='" + comment + '\'' +
                '}';
    }
}
