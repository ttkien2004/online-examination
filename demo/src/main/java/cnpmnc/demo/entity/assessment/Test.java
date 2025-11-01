package cnpmnc.demo.entity.assessment;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;
import cnpmnc.demo.entity.user.Teacher;

@Entity
@Table(name = EntityConstants.TEST_TABLE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Test_ID")
    Integer testId;

    @Column(name = "Title", length = 255)
    String title;

    @Column(name = "Description", columnDefinition = "TEXT")
    String description;

    @Column(name = "Pass_code", length = 50)
    String passCode;

    @ManyToOne
    @JoinColumn(name = "Creator_Teacher_ID")
    Teacher creator;
}