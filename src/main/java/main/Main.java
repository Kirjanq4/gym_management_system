package main;

import model.GroupTrainings;
import model.Member;
import model.Trainer;
import repository.RepositoryMember;
import repository.RepositoryTrainer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        RepositoryMember rm = new RepositoryMember();
        List<GroupTrainings> result = rm.listAllMemberGroupTrainings(1);
        for(GroupTrainings gtr: result) {
            System.out.println(gtr.toString());
        }

    }
}
