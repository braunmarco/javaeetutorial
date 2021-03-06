package de.braun.javaee.models;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name="users")
//@NamedQuery(name='User.findById', query='select u from User u where u.id = :id')
public class User  implements Serializable{
	//public static final String FIND_BY_ID = "User.findById";
	//public static final String FIND_BY_EMAIL = "User.findByEmail";
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String surname;
	private String username;
	private String password;
	private boolean avtive;
	private String email;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isAvtive() {
		return avtive;
	}

	public void setAvtive(boolean avtive) {
		this.avtive = avtive;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
	}
}
