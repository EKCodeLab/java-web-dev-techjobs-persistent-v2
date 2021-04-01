package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// Skill Model

@Entity
public class Skill extends AbstractEntity {

  // Variables
    @NotNull(message = "Skill description required")
    @Size(max = 500, message = "Limit to 500 characters.")
    private String description;

    // Constructors
    public Skill() {
    }

    public Skill(String description) {
        this.description = description;
    }

    // methods

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}