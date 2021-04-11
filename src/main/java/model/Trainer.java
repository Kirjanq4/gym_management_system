package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainerId;
    private String trainerName;
    private int salary;

    @OneToOne(mappedBy = "trainer")
    private GroupTrainings groupTrainings;

    @OneToOne(mappedBy = "trainer")
    private PersonalTrainings personalTrainings;

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", trainerName='" + trainerName + '\'' +
                ", salary=" + salary +
                ", numberOfMembers=" +
                ", listMembers=" +
                ", gymClass=" +
                '}';
    }
}
