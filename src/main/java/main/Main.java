package main;

import model.GroupTrainings;
import model.Member;
import model.Trainer;
import repository.RepositoryMember;
import repository.RepositoryTrainer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Member member = new Member();
//        member.setFirstName("Sam");
//        member.setLastName("Thompson");
//        member.setWeight(186);
//        member.setHeight(100);

        RepositoryMember rm = new RepositoryMember();
        List<GroupTrainings> result = rm.listAllMemberGroupTrainingsById();
        for(GroupTrainings grp: result) {
            System.out.println(grp.toString());
        }
//        rm.addMember(member);

//        Trainer trainer = new Trainer();
//        trainer.setTrainerName("Claudia");
//        trainer.setSalary(2800);
//
//        RepositoryTrainer rt = new RepositoryTrainer();
//        rt.addTrainer(trainer);



    }
}
