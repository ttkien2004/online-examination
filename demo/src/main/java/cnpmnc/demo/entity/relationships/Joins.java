package cnpmnc.demo.entity.relationships;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;
import cnpmnc.demo.entity.academic.Class;
import cnpmnc.demo.entity.user.Student;

import java.io.Serializable;

@Entity
@Table(name = "Joins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(JoinsId.class)
public class Joins {

    @Id
    @Column(name = "Student_User_ID")
    Integer studentUserId;

    @Id
    @Column(name = "Course_ID", length = 20)
    String courseId;

    @Id
    @Column(name = "`Group`", length = 20)
    String group;

    // Quan hệ với Student
    @ManyToOne
    @JoinColumn(name = "Student_User_ID", insertable = false, updatable = false)
    Student student;

    // Quan hệ với Class
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "Course_ID", referencedColumnName = "Course_ID", insertable = false, updatable = false),
        @JoinColumn(name = "`Group`", referencedColumnName = "`Group`", insertable = false, updatable = false)
    })
    Class classEntity;
}