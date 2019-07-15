package track.progress.Entity;


import javax.persistence.*;

@Entity
@Table(name = "FinishedThemes")
public class finishedThemes {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String theme;
    private String groups;

    public finishedThemes() {
    }

    public finishedThemes(String theme, String groups) {
        this.theme = theme;
        this.groups = groups;
    }

    public finishedThemes(String groups) {
        this.groups = groups;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }
}
