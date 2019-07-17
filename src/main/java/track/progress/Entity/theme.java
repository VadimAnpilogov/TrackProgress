package track.progress.Entity;


import javax.persistence.*;

@Entity
@Table(name = "theme")
public class theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descriptionTheme;
    private String time;

    public theme(){}

    public theme(String descriptionTheme, String time) {
        this.descriptionTheme = descriptionTheme;
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

    public String getDescriptionTheme() {
        return descriptionTheme;
    }

    public void setDescriptionTheme(String descriptionTheme) {
        this.descriptionTheme = descriptionTheme;
    }
}

