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
    public groupsL()
    {

    }
    public groupsL(String groups) {
        this.groups = groups;
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
