package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class PersonalTrainings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personalId;
    private String day;
    private float time;

    @OneToMany(mappedBy = "personalTrainings")
    private List<Member> members;

    @OneToOne
    @JoinColumn(name = "trainerId")
    private Trainer trainer;

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
}
