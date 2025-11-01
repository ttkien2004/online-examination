package cnpmnc.demo.entity.academic;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;

@Entity
@Table(name = EntityConstants.COURSE_TABLE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course {

    @Id
    @Column(name = "Course_ID", length = 20)
    String courseId;

    @Column(name = "Name", length = 100, nullable = false)
    String name;

    @Column(name = "Language", length = 50)
    String language;

    @ManyToOne
    @JoinColumn(name = "Semester_Name", nullable = true)
    Semester semester;
}