package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class GroupTrainings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private String name;
    private String day;
    private float time;

    @OneToMany(mappedBy = "groupTrainings")
    private List<Member> members;

    @OneToOne
    @JoinColumn(name = "trainerId")
    private Trainer trainer;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "GroupTrainings{" +
                "groupId=" + groupId +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", time=" + time +
                ", members=" + members +
                ", trainer=" + trainer +
                '}';
    }
}
