package Entities;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Two")
public class Two {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Basic
  @Column(name = "name")
  private  String name;

  @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  @JoinTable(name = "One_True",joinColumns = {@JoinColumn(name = "id_true")},inverseJoinColumns = {
          @JoinColumn(name = "id_one")
  })
  List<One> ones;

  public Two() {
  }

  public Two(String name) {

    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public List<One> getOnes() {
    return ones;
  }

  public void setOnes(List<One> ones) {
    this.ones = ones;
  }


  @Override
  public String toString() {
    return "Two{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
