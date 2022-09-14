package app.ivalley.kakatutorial.model;

//public record User(int id, String name) {
//}


public class UserDetails {
    int id;
    String name;

    public UserDetails() {
    }

    public UserDetails(int id, String name) {
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
        return "UserDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
