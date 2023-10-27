package org.launchcode.codingevents.models;

<<<<<<< HEAD
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class Event {
    @Id //primary key
    @GeneratedValue//wants database to generate value of primary key
  private int id;
    private String name;
    private String description;

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
    }

    public Event() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
>>>>>>> 0272eb9801ecf8dcc7310b45907cf1f9e54a99df
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

<<<<<<< HEAD
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
=======
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

>>>>>>> 0272eb9801ecf8dcc7310b45907cf1f9e54a99df
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
<<<<<<< HEAD
        if (!(o instanceof Event event)) return false;
=======
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
>>>>>>> 0272eb9801ecf8dcc7310b45907cf1f9e54a99df
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
