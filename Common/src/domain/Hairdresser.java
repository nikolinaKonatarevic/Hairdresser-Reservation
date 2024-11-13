/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Nikolina
 */
public class Hairdresser implements GenericEntity {
   
    private long id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfEmpleyment;
    private String status;

    public Hairdresser() {
    }

    public Hairdresser(long id, String firstname, String lastname, LocalDate dateOfEmpleyment, String status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfEmpleyment = dateOfEmpleyment;
        this.status = status;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfEmpleyment() {
        return dateOfEmpleyment;
    }

    public void setDateOfEmpleyment(LocalDate dateOfEmpleyment) {
        this.dateOfEmpleyment = dateOfEmpleyment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Hairdresser{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dateOfEmpleyment=" + dateOfEmpleyment + ", status=" + status + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Hairdresser other = (Hairdresser) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateOfEmpleyment, other.dateOfEmpleyment)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String getTableName() {
        return "hairdresser";
    }

    @Override
    public String getColumnNamesFromInsert() {
        return "(firstname, lastname,date_Of_Employment,status)";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        sb.append("'").append(firstname).append("',")
                .append("'").append(lastname).append("',")
                .append("'").append(dateOfEmpleyment).append("',")
                .append("'").append(status).append("'");
        return sb.toString();
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getSelectValues() {
        return "select * from hairdresser";
    }

    @Override
    public GenericEntity getNewObject(ResultSet rs) throws SQLException {
        return new Hairdresser(rs.getLong("hairdresser_id"), rs.getString("firstname"), rs.getString("lastname"), rs.getDate("date_of_employment").toLocalDate(), rs.getString("status"));
    }

    @Override
    public String getDeleteAndUpdateCondition(Object object) {
        return "hairdresser_id = " + ((Hairdresser)object).getId();
    }

    @Override
    public String getUpdateSetValues(Object object) {
        Hairdresser hairdresser = (Hairdresser) object;
        StringBuilder sb = new StringBuilder();
        sb.append("firstaname = '").append(hairdresser.firstname).append("',")
                .append("lastname = '").append(hairdresser.getLastname()).append("',")
                .append("date_Of_Employment ='").append(Date.valueOf(hairdresser.getDateOfEmpleyment())).append("',")
                .append("status = '").append(hairdresser.getStatus()).append("'");
        return sb.toString();
    }
    
    
}    