package ch.dashboard.backend.team_dashboard.entities;

import javax.persistence.*;

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


    String first_name;
    String last_name;
    String objective;
    double achievment;
    String objective_type;
    String Objective_deadline;
    boolean objective_status;
    String comment;

    public Entry() {

    }

    public Entry(String first_name, String last_name, String objective, double achievment, String objective_type, String objective_deadline, boolean objective_status, String comment) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.objective = objective;
        this.achievment = achievment;
        this.objective_type = objective_type;
        Objective_deadline = objective_deadline;
        this.objective_status = objective_status;
        this.comment = comment;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public Long getId() {
        return id;
    }

    public void setAchievment(double achievment) {
        this.achievment = achievment;
    }

    public String getObjective_type() {
        return objective_type;
    }

    public void setObjective_type(String objective_type) {
        this.objective_type = objective_type;
    }

    public String getObjective_deadline() {
        return Objective_deadline;
    }

    public void setObjective_deadline(String objective_deadline) {
        Objective_deadline = objective_deadline;
    }

    public boolean isObjective_status() {
        return objective_status;
    }

    public void setObjective_status(boolean objective_status) {
        this.objective_status = objective_status;
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
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", objective='" + objective + '\'' +
                ", achievment=" + achievment +
                ", objective_type='" + objective_type + '\'' +
                ", Objective_deadline='" + Objective_deadline + '\'' +
                ", objective_status=" + objective_status +
                ", comment='" + comment + '\'' +
                '}';
    }
}
