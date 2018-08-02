package com.kenzan.employee.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/** 
 @author Jason Canney
 Domain employee class 
 The Employee class defines the domain object for employee data that will
 be received by the CDE from the mobile app and then stored in a data store
 by the CDE
*/
@Entity
@Table(name = "employee")
public class employee implements Serializable
{

 /**  @param serialVersionUID
  The serialVersionUID is a universal version identifier for a Serializable class. Deserialization uses this
  number to ensure that a loaded class corresponds exactly to a serialized object. If no match is found,
  then an InvalidClassException is thrown
 */

	private static final long serialVersionUID = 4349382150030819493L;

        @Id
        // @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name = "EmployeeID")
	/** 
	 Employees ID
	*/
	private int employeeID;

        @Column(name = "FirstName", nullable = false, length = 50)
	/** 
	 Employees First Name
	*/
	private String employeeFirstName;

        @Column(name = "MiddleInitial", nullable = false, length = 50)
	/** 
	 Employees Middle Initial
	*/
	private String employeeMiddleInitial;

        @Column(name = "LastName", nullable = false, length = 50)
	/** 
	 Employees Last Name
	*/
	private String employeeLastName;

        @Column(name = "DOB", nullable = false, length = 50)
	/** 
	 Employee email address
	*/
	private String dob;

        @Column(name = "DOE", nullable = false, length = 50)
	/** 
	 Employee phone
	*/
	private String doe;

        @Column(name = "Status", nullable = false, length = 50)
	/** 
	 Employee Address1
	*/
	private String status;

    public employee() {
    }

    public employee(int employeeID, String employeeFirstName, String employeeMiddleInitial, String employeeLastName, String dob, String doe, String status) {
        this.employeeID = employeeID;
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleInitial = employeeMiddleInitial;
        this.employeeLastName = employeeLastName;
        this.dob = dob;
        this.doe = doe;
        this.status = status;
    }

    public employee(String employeeFirstName, String employeeMiddleInitial, String employeeLastName, String dob, String doe, String status) {
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleInitial = employeeMiddleInitial;
        this.employeeLastName = employeeLastName;
        this.dob = dob;
        this.doe = doe;
        this.status = status;
    }

    
    
    
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeMiddleInitial() {
        return employeeMiddleInitial;
    }

    public void setEmployeeMiddleInitial(String employeeMiddleInitial) {
        this.employeeMiddleInitial = employeeMiddleInitial;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.employeeID;
        hash = 67 * hash + Objects.hashCode(this.employeeFirstName);
        hash = 67 * hash + Objects.hashCode(this.employeeMiddleInitial);
        hash = 67 * hash + Objects.hashCode(this.employeeLastName);
        hash = 67 * hash + Objects.hashCode(this.dob);
        hash = 67 * hash + Objects.hashCode(this.doe);
        hash = 67 * hash + Objects.hashCode(this.status);
        return hash;
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
        final employee other = (employee) obj;
        if (this.employeeID != other.employeeID) {
            return false;
        }
        if (!Objects.equals(this.employeeFirstName, other.employeeFirstName)) {
            return false;
        }
        if (!Objects.equals(this.employeeMiddleInitial, other.employeeMiddleInitial)) {
            return false;
        }
        if (!Objects.equals(this.employeeLastName, other.employeeLastName)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        if (!Objects.equals(this.doe, other.doe)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employee{" + "employeeID=" + employeeID + ", employeeFirstName=" + employeeFirstName + ", employeeMiddleInitial=" + employeeMiddleInitial + ", employeeLastName=" + employeeLastName + ", dob=" + dob + ", doe=" + doe + ", status=" + status + '}';
    }
        
}

