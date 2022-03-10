package spring.hasib.first;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ModelFirst {
    @Id
    int id;
    int name;
    int year;
    int age;

}
