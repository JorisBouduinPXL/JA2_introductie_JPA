package be.pxl.ja2.jpa.opdracht1;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "PERSONS", uniqueConstraints = {@UniqueConstraint(columnNames = "firstName")})
public class Person {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @ Column(name = "LAST_NAME")
    private String lastName;
    private long version;
    private LocalDate birthDay;
    private String gender;
    private byte picture;
    private String comment;
    private boolean married;
    private int age;
    private String homepage;

}
