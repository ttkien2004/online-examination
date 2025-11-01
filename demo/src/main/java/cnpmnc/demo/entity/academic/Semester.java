package cnpmnc.demo.entity.academic;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;

@Entity
@Table(name = EntityConstants.SEMESTER_TABLE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Semester {

    @Id
    @Column(name = "Semester_Name", length = 50)
    String semesterName;
}