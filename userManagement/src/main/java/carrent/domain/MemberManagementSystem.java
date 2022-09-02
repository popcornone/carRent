package carrent.domain;

import carrent.UserManagementApplication;
import carrent.domain.PersonalInformationRegistered;
import carrent.domain.Registered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MemberManagementSystem_table")
@Data
public class MemberManagementSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userName;

    private Date birthDate;

    private Date phoneNo;

    private Integer age;

    @PostPersist
    public void onPostPersist() {
        PersonalInformationRegistered personalInformationRegistered = new PersonalInformationRegistered(
            this
        );
        personalInformationRegistered.publishAfterCommit();

        Registered registered = new Registered(this);
        registered.publishAfterCommit();
    }

    public static MemberManagementSystemRepository repository() {
        MemberManagementSystemRepository memberManagementSystemRepository = UserManagementApplication.applicationContext.getBean(
            MemberManagementSystemRepository.class
        );
        return memberManagementSystemRepository;
    }

    public static void reservation(Reserved reserved) {
        /** Example 1:  new item 
        MemberManagementSystem memberManagementSystem = new MemberManagementSystem();
        repository().save(memberManagementSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(memberManagementSystem->{
            
            memberManagementSystem // do something
            repository().save(memberManagementSystem);


         });
        */

    }
}
