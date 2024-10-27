package sit.int202.simple.entities;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

//1.Create Model Subject
public class Subject {
    private String id;
    private String title;
    private double credit;
}
