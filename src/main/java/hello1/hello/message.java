package hello1.hello;


import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fio;
    private String groups;
    public message()
    {

    }


    public message(String fio, String groups) {
        this.fio = fio;
        this.groups = groups;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }
}
