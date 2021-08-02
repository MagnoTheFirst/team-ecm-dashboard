package ch.dashboard.backend.team_dashboard.entities;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

public class Objective {
    String name;
    String description;
    LocalDate deadline;
    String owner;
    boolean achieved;

    public Objective(@NonNull String name, @NonNull String description, LocalDate deadline, String owner) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public void setAchieved(boolean achieved) {
        this.achieved = achieved;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", owner='" + owner + '\'' +
                ", achieved=" + achieved +
                '}';
    }
}
