package cnpmnc.demo.entity.junction;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;
import cnpmnc.demo.entity.assessment.Test;
import cnpmnc.demo.entity.user.Student;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Student_Test_Attempt")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(StudentTestAttemptId.class)
public class StudentTestAttempt {

    @Id
    @Column(name = "Student_User_ID")
    Integer studentUserId;

    @Id
    @Column(name = "Test_ID")
    Integer testId;

    @Column(name = "Start_time")
    LocalDateTime startTime;

    @Column(name = "Submit_time")
    LocalDateTime submitTime;

    // Result là thuộc tính dẫn xuất → không lưu

    @ManyToOne
    @JoinColumn(name = "Student_User_ID", insertable = false, updatable = false)
    Student student;

    @ManyToOne
    @JoinColumn(name = "Test_ID", insertable = false, updatable = false)
    Test test;
}