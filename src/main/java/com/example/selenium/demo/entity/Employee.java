package com.example.selenium.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @project: selenium.demo
 * @author: Dongbo Tang
 * @Date: 18/03/2022
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String description;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder().append(id, employee.id).append(firstName, employee.firstName).append(lastName, employee.lastName).append(description, employee.description).isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37).append(id).append(firstName).append(lastName).append(description).toHashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
