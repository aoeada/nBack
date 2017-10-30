package main.java.Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="users")
public class User implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userid")
	private int userId;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
        @Column(name="DOB")
        private Date DOB;
        @Column(name="SSN")
        private int SSN;
        @Column(name="isAlive")
        private boolean isAlive;
        @Column(name="DOD")
        private Date DOD;
        @Column(name="permissionLevel")
        private int permissionLevel;
	
	public User(String username, String password, String firstname, String lastname, Date DOB, int SSN, boolean isAlive, Date DOD, int permissionLevel){
		super();
		this.setUsername(username);
		this.setPassword(password);
		this.setFirstname(firstname);
		this.setLastname(lastname);
                this.setDateOfBirth(DOB);
                this.setSSN(SSN);
                this.setIsAlive(isAlive);
                this.setDateOfDeath(DOD);
                this.setPermissionLevel(permissionLevel);
	}
	
	public User(){
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
        
        public Date getDateOfBirth(){
                return DOB;
        }
        
        public void setDateOfBirth(Date DOB){
                this.DOB = DOB;
        }
        
        public int getSSN(){
                return SSN;
        }
        
        public void setSSN(int SSN){
                this.SSN = SSN;
        }
        
        public boolean getIsAlive(){
                return isAlive;
        }
        
        public void setIsAlive(boolean isAlive){
                this.isAlive = isAlive;
        }
        
        public Date getDOD(){
            return this.DOD;
        }
        
        public void setDateOfDeath(Date DOD){
            this.DOD = DOD;
        }
        
        public int getPermissionLevel(){
            return permissionLevel;
        }
        
        public void setPermissionLevel(int permissionLevel){
            this.permissionLevel = permissionLevel;
        }
}
