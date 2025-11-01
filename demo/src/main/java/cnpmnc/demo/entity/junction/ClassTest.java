package cnpmnc.demo.entity.junction;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;
import cnpmnc.demo.entity.academic.Class;
import cnpmnc.demo.entity.assessment.Test;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Class_Test")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(ClassTestId.class)
public class ClassTest {

    @Id
    @Column(name = "Course_ID", length = 20)
    String courseId;

    @Id
    @Column(name = "`Group`", length = 20)
    String group;

    @Id
    @Column(name = "Test_ID")
    Integer testId;

    @Column(name = "Deadline")
    LocalDateTime deadline;

    @Column(name = "Create_date")
    LocalDate createDate;

    @Column(name = "Time")
    Integer time; // phút

    @Column(name = "Number_question")
    Integer numberQuestion;

    // Quan hệ với Class
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "Course_ID", referencedColumnName = "Course_ID", insertable = false, updatable = false),
        @JoinColumn(name = "`Group`", referencedColumnName = "`Group`", insertable = false, updatable = false)
    })
    Class classEntity;

    // Quan hệ với Test
    @ManyToOne
    @JoinColumn(name = "Test_ID", insertable = false, updatable = false)
    Test test;
}