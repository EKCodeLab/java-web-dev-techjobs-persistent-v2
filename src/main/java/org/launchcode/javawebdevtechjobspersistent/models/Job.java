package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    @NotNull(message = "Job required")
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

//    @NotNull
//    private String pwHash;

//    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

//    public Job(String name,String password) {
//        super(name);
//        this.pwHash = encoder.encode(password);
//    }

//    public boolean isMatchingPassword(String password) {
//        return encoder.matches(password, pwHash);
//    }


    public Job() {
    }

    public Job(Employer employer) {
        this.employer = employer;
    }


//    public Job(Employer employer, Skill skill) {
//        super();
//        this.employer = employer;
//        this.skills = skill;
//    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> newSkills) {
        for (Skill skill : newSkills) {
            this.skills.add(skill);
        }
        //this.skills = skills;
    }
}

