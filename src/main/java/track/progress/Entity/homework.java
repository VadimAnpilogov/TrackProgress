package track.progress.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "homework")
public class homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String groups;
    private Date date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public homework(Date date, String description, String groups) {
        this.date = date;
        this.description = description;
        this.groups = groups;

    }
}
