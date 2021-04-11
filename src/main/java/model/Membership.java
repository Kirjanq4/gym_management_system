package model;

import javax.persistence.*;
import java.util.List;

@Entity

public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int membershipId;
    private int periodMonth;
    private int price;

    @OneToMany(mappedBy = "membership")
    private List<Member> members;


    public int getId() {
        return membershipId;
    }

    public void setId(int id) {
        this.membershipId = id;
    }

    public int getPeriod() {
        return periodMonth;
    }

    public void setPeriod(int period) {
        this.periodMonth = period;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
