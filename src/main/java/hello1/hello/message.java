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
    private String group2;
    public message()
    {

    }

    public message(String fio, String group2) {

       // this.id = id;
        this.fio = fio;
        this.group2 = group2;
    }

//    public message(String fio, String group) {
//        this.fio = fio;
//        this.group = group;
//    }

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

    public String getGroup2() {
        return group2;
    }

    public void setGroup2(String group2) {
        this.group2 = group2;
    }
}
