package track.progress.Entity;


import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Table(name = "groups")
public class groupsL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String groups;
    private String time;

    public groupsL()
    {

    }

    public groupsL(String groups, String time) {
        this.groups = groups;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }
}
