package cnpmnc.demo.entity.relationships;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;
import cnpmnc.demo.entity.academic.Class;
import cnpmnc.demo.entity.user.Teacher;

import java.io.Serializable;

@Entity
@Table(name = "Teaches")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(TeachesId.class)
public class Teaches {

    @Id
    @Column(name = "Teacher_User_ID")
    Integer teacherUserId;

    @Id
    @Column(name = "Course_ID", length = 20)
    String courseId;

    @Id
    @Column(name = "`Group`", length = 20)
    String group;

    // Quan hệ với Teacher
    @ManyToOne
    @JoinColumn(name = "Teacher_User_ID", insertable = false, updatable = false)
    Teacher teacher;

    // Quan hệ với Class
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "Course_ID", referencedColumnName = "Course_ID", insertable = false, updatable = false),
        @JoinColumn(name = "`Group`", referencedColumnName = "`Group`", insertable = false, updatable = false)
    })
    Class classEntity;
}