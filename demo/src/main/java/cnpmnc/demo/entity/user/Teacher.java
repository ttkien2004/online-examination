package cnpmnc.demo.entity.user;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;

import lombok.experimental.SuperBuilder;

@Entity
@Table(name = EntityConstants.TEACHER_TABLE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "User_ID")
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher extends User {

    @Column(name = "Specialization", length = 100)
    String specialization;

    @Column(name = "Qualification", length = 100)
    String qualification;
}