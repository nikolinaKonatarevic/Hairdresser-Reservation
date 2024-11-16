/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Nikolina
 */
public class Appointment implements GenericEntity{
    
    private long id;
    private LocalDateTime dateTimeStart;
    private LocalDateTime createdOn;
    private BigDecimal totalPrice;
    private String status;
    private Hairdresser hairdresser;
    private User user;
    private List<AppointmentItem> items; 

    public Appointment() {
    }

    public Appointment(long id, LocalDateTime dateTimeStart, LocalDateTime createdOn, BigDecimal totalPrice, String status, Hairdresser hairdresser, User user) {
        this.id = id;
        this.dateTimeStart = dateTimeStart;
        this.createdOn = createdOn;
        this.totalPrice = totalPrice;
        this.status = status;
        this.hairdresser = hairdresser;
        this.user = user;
        items = new ArrayList<>();
        
    }

    

    public long getId() {
        return id;
    }

    

    public LocalDateTime getDateTimeStart() {
        return dateTimeStart;
    }

    public void setDateTimeStart(LocalDateTime dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Hairdresser getHairdresser() {
        return hairdresser;
    }

    public void setHairdresser(Hairdresser hairdresser) {
        this.hairdresser = hairdresser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        final Appointment other = (Appointment) obj;
        if (!Objects.equals(this.id, other.id))
            return false;
        if (!Objects.equals(this.dateTimeStart, other.dateTimeStart))
            return false;
        if (!Objects.equals(this.createdOn, other.createdOn))
            return false;
        if (!Objects.equals(this.hairdresser, other.hairdresser))
            return false;
        if (!Objects.equals(this.user, other.user))
            return false;
        if (!Objects.equals(this.totalPrice, other.totalPrice))
            return false;
        if (!Objects.equals(this.status, other.status))
            return false;
        return Objects.equals(this.items, this.items);
        
        
    }

    
    @Override
    public String toString() {
        return "Appointment{" + "id=" + id + ", dateTimeStart=" + dateTimeStart + ", createdOn=" + createdOn + ", totalPrice=" + totalPrice + ", hairdresser=" + hairdresser + ", user=" + user + '}';
    }

    @Override
    public String getTableName() {
        return "appointment";
    }

    @Override
    public String getColumnNamesFromInsert() {
        return "appointment_id, date_time_start, created_on, total_price, hairdresser_id, user_id";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        sb.append("'").append(dateTimeStart).append("', '")
                .append(createdOn).append("', '")
                .append(totalPrice).append("',")
                .append(hairdresser.getId()).append(",")
                .append(user.getId());
        return sb.toString();
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getSelectValues() {
        return "SELECT *"
                +" FROM appointment AS app INNER JOIN "
                + "hairdresser AS h ON hairdresser_id = app.hairdresser_id INNER JOIN " 
                + " user AS u ON u.user_id = app.user_id ";
    }

    @Override
    public GenericEntity getNewObject(ResultSet rs) throws SQLException {
       
        return new Appointment(rs.getLong("appointment_id"),rs.getTimestamp("date_time_start").toLocalDateTime(),
                rs.getTimestamp("date_time_start").toLocalDateTime(), rs.getBigDecimal("total_price"), rs.getString("status"),
             new Hairdresser (rs.getLong("h.hairdresser_id"), rs.getString("h.firstname"),
                     rs.getString("h.lastname"),
                     rs.getDate("h.date_of_employment").toLocalDate(), rs.getString("h.status")),
                new User (rs.getLong("u.user_id"), rs.getString("u.firstname"),
                        rs.getString("u.lastname"), rs.getString("u.email"),
                rs.getString("u.password"),rs.getString("u.role")));   
    }

    @Override
    public String getDeleteAndUpdateCondition(Object object) {
        return "appointment_id="+ ((Appointment)object).getId();
    }

    @Override
    public String getUpdateSetValues(Object object) {
        Appointment appointment = (Appointment) object;
        return " date_time_start = '" + Timestamp.valueOf(appointment.getDateTimeStart()) + "', status = '" + appointment.getStatus()+"', hairdresser_id ="+appointment.getHairdresser().getId()+" ";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<AppointmentItem> getItems() {
        return items;
    }

    public void setItems(List<AppointmentItem> items) {
        this.items = items;
    }
    
    
}