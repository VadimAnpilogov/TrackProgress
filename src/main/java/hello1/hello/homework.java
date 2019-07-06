package hello1.hello;

import javax.persistence.*;

@Entity
@Table(name = "homework")
public class homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String groups;
    private String date;
    public homework () {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public homework(String description, String groups, String date) {
        this.description = description;
        this.groups = groups;
        this.date = date;
    }
}
