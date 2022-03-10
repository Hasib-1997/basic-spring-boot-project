package spring.hasib.first;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hasib")
public class ModelHasib {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  int hello;
  String hall;
  String room;  
  
 public void setId(int id){ 
   this.id = id;
 }

 public void setHello(int hello){
   this.hello = hello;
 }

 public void setHall(String hall){
   this.hall = hall;
 }

 public void setroom(String room) {
   this.room = room;
 }
}
