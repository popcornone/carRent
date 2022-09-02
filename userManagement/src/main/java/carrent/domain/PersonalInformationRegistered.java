package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PersonalInformationRegistered extends AbstractEvent {

    private Long id;
    private String userName;
    private Date birthDate;
    private Date phoneNo;
    private String licenseNo;
    private String address;
    private Long userId;
    private Integer age;

    public PersonalInformationRegistered(MemberManagementSystem aggregate) {
        super(aggregate);
    }

    public PersonalInformationRegistered() {
        super();
    }
    // keep

}
