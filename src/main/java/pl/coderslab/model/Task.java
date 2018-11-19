package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 99, message = "Wpisz przynajmniej jeden znak (max. 99)")
    private String text;

    private Boolean active;
    private LocalDate created;
    private LocalDate updated;
    private LocalDate completed;
    private Date deadLine;

    private String deadLinee;

    private Boolean isPast;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "priority_id")
    private Priority priority;


    public String getPriority (Priority priority) {
        return "Task{" +
                "priority=" + priority +
                '}';
    }

    //##############################################


    public Boolean getPast() {
        return isPast;
    }

    public void setPast(Boolean past) {
        isPast = past;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public LocalDate getCompleted() {
        return completed;
    }

    public void setCompleted(LocalDate completed) {
        this.completed = completed;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public String getDeadLinee() {
        return deadLinee;
    }

    public void setDeadLinee(String deadLinee) {
        this.deadLinee = deadLinee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task user = (Task) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
