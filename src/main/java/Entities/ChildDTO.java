package Entities;

/**
 * Created by linhtran on 15/04/2017.
 */
public class ChildDTO {
    private int id;
    private String name;
    private  String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChildDTO(int id, String name) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ChildDTO{" +
                "id=" + id +
                ", name='" + name +",type="+type +'\'' +
                '}';
    }
}
