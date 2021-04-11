package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    private String firstName;
    private String lastName;
    private int weight;
    private int height;

    @ManyToOne
    @JoinColumn(name = "membershipId")
    private Membership membership;

    @ManyToOne
    @JoinColumn(name = "groupId")
    private GroupTrainings groupTrainings;

    @ManyToOne
    @JoinColumn(name = "personalId")
    private PersonalTrainings personalTrainings;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
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



    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", trainer=" +
                '}';
    }
}
