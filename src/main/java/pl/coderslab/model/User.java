package pl.coderslab.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import pl.coderslab.repository.TaskRepository;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String userName;

    @NotEmpty
    private String password;

    @NotEmpty
    @Email
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Task> tasks = new ArrayList<>();

    //TODO: w razie w duzy Boolean
    private boolean enabled;


    //Bezargumentowy konstruktor oznaczony jako public lub protected.
    public User() {
    }

    //gettery i settery

    //TODO??

    public int getActiveTasksCountt() {
        final int[] counter = new int[1] ;
        tasks.forEach(item-> {
            if(item.getActive()){
                int x = counter[0];
                counter[0] = ++x;
            }
        });
        return counter[0];
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    //haszowanie poza setterem passworda
    public void setHashedPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());

    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
