package cnpmnc.demo.entity.user;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import cnpmnc.demo.common.constants.EntityConstants;

@Entity
@Table(name = EntityConstants.STUDENT_TABLE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "User_ID")
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends User {

    @Column(name = "Grade_level", length = 50)
    String gradeLevel;

    @Column(name = "Major", length = 100)
    String major;

    @Column(name = "Education_level", length = 100)
    String educationLevel;
}