package pl.coderslab.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class RegistrationDto {

    @NotEmpty(message = "Pole nie może być puste")
    private String login;

    @Email(message = "Niepoprawna forma adresu email")
    @NotEmpty(message = "Pole nie może być puste")
    private String email;
    @NotEmpty(message = "Pole nie może być puste")
    private String password;
    @NotEmpty(message = "Pole nie może być puste")
    private String passwordRepeat;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }
}
