package hello1.hello;


import javax.persistence.*;

@Entity
@Table(name = "theme")
public class theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descriptionTheme;

    public theme(){}

    public theme(String descriptionTheme) {
        this.descriptionTheme = descriptionTheme;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescriptionTheme() {
        return descriptionTheme;
    }

    public void setDescriptionTheme(String descriptionTheme) {
        this.descriptionTheme = descriptionTheme;
    }
}

