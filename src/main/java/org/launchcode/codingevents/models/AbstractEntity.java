package org.launchcode.codingevents.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id //primary key
    @GeneratedValue//wants database to generate value of primary key
    private int id;
    public int getId() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //if (!(o instanceof AbstractEntity entity)) return false;

        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity entity = (AbstractEntity) o;
        return id == entity.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
