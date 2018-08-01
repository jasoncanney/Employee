package com.kenzan.employee.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/** 
 @author Jason Canney
 Domain Consumer class 
 The Consumer class defines the domain object for consumer data that will
 be received by the CDE from the mobile app and then stored in a data store
 by the CDE
*/
@Entity
@Table(name = "consumer")
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
        @Column(name = "ConsumerID")
	/** 
	 Consumers ID
	*/
	private int consumerID;

        @Column(name = "ConsumerFirstName", nullable = false, length = 50)
	/** 
	 Consumers First Name
	*/
	private String consumerFirstName;

        @Column(name = "ConsumerMiddleInitial", nullable = false, length = 50)
	/** 
	 Consumers Middle Initial
	*/
	private String consumerMiddleInitial;

        @Column(name = "ConsumerLastName", nullable = false, length = 50)
	/** 
	 Consumers Last Name
	*/
	private String consumerLastName;

        @Column(name = "ConsumerEmail", nullable = false, length = 50)
	/** 
	 Consumer email address
	*/
	private String consumerEmail;

        @Column(name = "ConsumerPhone", nullable = false, length = 50)
	/** 
	 Consumer phone
	*/
	private String consumerPhone;

        @Column(name = "ConsumerAddress", nullable = false, length = 50)
	/** 
	 Consumer Address1
	*/
	private String consumerAddress;

        @Column(name = "ConsumerCity", nullable = false, length = 50)
	/** 
	 Consumer City
	*/
	private String consumerCity;

        @Column(name = "ConsumerState", nullable = false, length = 50)
	/** 
	 Consumer State
	*/
	private String consumerState;

        @Column(name = "ConsumerZip", nullable = false, length = 50)
	/** 
	 Consumer Zip
	*/
	private String consumerZip;

        @Column(name = "ConsumerSocEmail", nullable = false, length = 50)
	/** 
	 Consumer SocialEmail
	*/
	private String consumerSocEmail;

        @Column(name = "DemoID")
	/** 
	 Demographic ID
	*/
	private int demoID;
        
        @Column(name = "DeviceLocID")
	/** 
	 Device Location ID
	*/
	private String deviceLocID;
        
        @Column(name = "ProviderID")
	/** 
	 Provider ID
	*/
	private int providerID;

        @Column(name = "ConsumerPWD")
        /**
         * Consumer Password
         */        
	String consumerPWD;
        
	/** 
	  Default Constructor
	  @param consumer object
	*/
	public employee()
	{

	}
 
        /*
        Overloaded Constructor
        *
        */
        public employee(int consumerID, String consumerFirstName, String consumerMiddleInitial, String consumerLastName, String consumerEmail, String consumerPhone, String consumerAddress, String consumerCity, String consumerState, String consumerZip, String consumerSocEmail, int demoID, String deviceLocID, int providerID, String consumerPWD) {
            this.consumerID = consumerID;
            this.consumerFirstName = consumerFirstName;
            this.consumerMiddleInitial = consumerMiddleInitial;
            this.consumerLastName = consumerLastName;
            this.consumerEmail = consumerEmail;
            this.consumerPhone = consumerPhone;
            this.consumerAddress = consumerAddress;
            this.consumerCity = consumerCity;
            this.consumerState = consumerState;
            this.consumerZip = consumerZip;
            this.consumerSocEmail = consumerSocEmail;
            this.demoID = demoID;
            this.deviceLocID = deviceLocID;
            this.providerID = providerID;
            this.consumerPWD = consumerPWD;
        }

    public int getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(int consumerID) {
        this.consumerID = consumerID;
    }

    public String getConsumerFirstName() {
        return consumerFirstName;
    }

    public void setConsumerFirstName(String consumerFirstName) {
        this.consumerFirstName = consumerFirstName;
    }

    public String getConsumerMiddleInitial() {
        return consumerMiddleInitial;
    }

    public void setConsumerMiddleInitial(String consumerMiddleInitial) {
        this.consumerMiddleInitial = consumerMiddleInitial;
    }

    public String getConsumerLastName() {
        return consumerLastName;
    }

    public void setConsumerLastName(String consumerLastName) {
        this.consumerLastName = consumerLastName;
    }

    public String getConsumerEmail() {
        return consumerEmail;
    }

    public void setConsumerEmail(String consumerEmail) {
        this.consumerEmail = consumerEmail;
    }

    public String getConsumerPhone() {
        return consumerPhone;
    }

    public void setConsumerPhone(String consumerPhone) {
        this.consumerPhone = consumerPhone;
    }

    public String getConsumerAddress() {
        return consumerAddress;
    }

    public void setConsumerAddress(String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    public String getConsumerCity() {
        return consumerCity;
    }

    public void setConsumerCity(String consumerCity) {
        this.consumerCity = consumerCity;
    }

    public String getConsumerState() {
        return consumerState;
    }

    public void setConsumerState(String consumerState) {
        this.consumerState = consumerState;
    }

    public String getConsumerZip() {
        return consumerZip;
    }

    public void setConsumerZip(String consumerZip) {
        this.consumerZip = consumerZip;
    }

    public String getConsumerSocEmail() {
        return consumerSocEmail;
    }

    public void setConsumerSocEmail(String consumerSocEmail) {
        this.consumerSocEmail = consumerSocEmail;
    }

    public int getDemoID() {
        return demoID;
    }

    public void setDemoID(int demoID) {
        this.demoID = demoID;
    }

    public String getDeviceLocID() {
        return deviceLocID;
    }

    public void setDeviceLocID(String deviceLocID) {
        this.deviceLocID = deviceLocID;
    }

    public int getProviderID() {
        return providerID;
    }

    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }

    public String getConsumerPWD() {
        return consumerPWD;
    }

    public void setConsumerPWD(String consumerPWD) {
        this.consumerPWD = consumerPWD;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.consumerID;
        hash = 97 * hash + Objects.hashCode(this.consumerFirstName);
        hash = 97 * hash + Objects.hashCode(this.consumerMiddleInitial);
        hash = 97 * hash + Objects.hashCode(this.consumerLastName);
        hash = 97 * hash + Objects.hashCode(this.consumerEmail);
        hash = 97 * hash + Objects.hashCode(this.consumerPhone);
        hash = 97 * hash + Objects.hashCode(this.consumerAddress);
        hash = 97 * hash + Objects.hashCode(this.consumerCity);
        hash = 97 * hash + Objects.hashCode(this.consumerState);
        hash = 97 * hash + Objects.hashCode(this.consumerZip);
        hash = 97 * hash + Objects.hashCode(this.consumerSocEmail);
        hash = 97 * hash + this.demoID;
        hash = 97 * hash + Objects.hashCode(this.deviceLocID);
        hash = 97 * hash + this.providerID;
        hash = 97 * hash + Objects.hashCode(this.consumerPWD);
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
        if (this.consumerID != other.consumerID) {
            return false;
        }
        if (this.demoID != other.demoID) {
            return false;
        }
        if (this.providerID != other.providerID) {
            return false;
        }
        if (!Objects.equals(this.consumerFirstName, other.consumerFirstName)) {
            return false;
        }
        if (!Objects.equals(this.consumerMiddleInitial, other.consumerMiddleInitial)) {
            return false;
        }
        if (!Objects.equals(this.consumerLastName, other.consumerLastName)) {
            return false;
        }
        if (!Objects.equals(this.consumerEmail, other.consumerEmail)) {
            return false;
        }
        if (!Objects.equals(this.consumerPhone, other.consumerPhone)) {
            return false;
        }
        if (!Objects.equals(this.consumerAddress, other.consumerAddress)) {
            return false;
        }
        if (!Objects.equals(this.consumerCity, other.consumerCity)) {
            return false;
        }
        if (!Objects.equals(this.consumerState, other.consumerState)) {
            return false;
        }
        if (!Objects.equals(this.consumerZip, other.consumerZip)) {
            return false;
        }
        if (!Objects.equals(this.consumerSocEmail, other.consumerSocEmail)) {
            return false;
        }
        if (!Objects.equals(this.deviceLocID, other.deviceLocID)) {
            return false;
        }
        if (!Objects.equals(this.consumerPWD, other.consumerPWD)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "consumer{" + "consumerID=" + consumerID + ", consumerFirstName=" + consumerFirstName + ", consumerMiddleInitial=" + consumerMiddleInitial + ", consumerLastName=" + consumerLastName + ", consumerEmail=" + consumerEmail + ", consumerPhone=" + consumerPhone + ", consumerAddress=" + consumerAddress + ", consumerCity=" + consumerCity + ", consumerState=" + consumerState + ", consumerZip=" + consumerZip + ", consumerSocEmail=" + consumerSocEmail + ", demoID=" + demoID + ", deviceLocID=" + deviceLocID + ", providerID=" + providerID + ", consumerPWD=" + consumerPWD + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

        
}