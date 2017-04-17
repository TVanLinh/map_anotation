package Entities;

import javax.persistence.*;

/**
 * Created by linhtran on 13/04/2017.
 */
@Entity
@Table(name = "PHONE")
public class Phone {
    @Id
    @Column(name = "IDPHONE", nullable = false)
    private int idPhone;

    @Basic
    @Column(name = "PROVIDER", nullable = false, length = 50)
    private String provider;

    @Basic
    @Column(name = "PHONENUMBER", nullable = false)
    private String phoneNumber;
    
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Employee.class)
    @JoinColumn(name = "OWNER_IDEMPLOYEE",referencedColumnName = "IDEMPLOYEE")
    private Employee ownerIdemployee;


    public Phone() {
    }

    public Phone(String provider, String phoneNumber) {
        this.provider = provider;
        this.phoneNumber = phoneNumber;
    }

    public Phone(String provider, String phoneNumber, Employee ownerIdemployee) {
        this.provider = provider;
        this.phoneNumber = phoneNumber;
        this.ownerIdemployee = ownerIdemployee;
    }

    public int getIdphone() {
        return idPhone;
    }

    public void setIdphone(int idphone) {
        this.idPhone = idphone;
    }


    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }


    public String getPhonenumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phoneNumber = phonenumber;
    }

    public Employee getOwnerIdemployee() {
        return ownerIdemployee;
    }

    public void setOwnerIdemployee(Employee ownerIdemployee) {
        this.ownerIdemployee = ownerIdemployee;
    }

    @Override
    public boolean equals(Object o) {
        Phone phone=(Phone)o;
        if(this.idPhone==phone.idPhone&&this.provider.equals(phone.provider)&&this.phoneNumber.equals(phone.phoneNumber)&&this.ownerIdemployee==phone.ownerIdemployee)
        {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.idPhone+this.phoneNumber.hashCode()+this.provider.hashCode();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "idphone=" + idPhone +
                ", provider='" + provider + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
