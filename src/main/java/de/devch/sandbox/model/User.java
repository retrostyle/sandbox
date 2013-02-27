package main.java.de.devch.sandbox.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The Class User.
 */
@Entity
@Table(name = "user")
public class User {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The firstname. */
	@Column(name = "FIRSTNAME")
	private String firstname;

	/** The lastname. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** The password. */
	@Column(name = "PASSWORD")
	private String password;

	/** The email. */
	@Column(name = "EMAIL")
	private String email;

	/** The registrationdate. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date registrationdate;

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the firstname.
	 * 
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the firstname.
	 * 
	 * @param firstname the new firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Gets the lastname.
	 * 
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Sets the lastname.
	 * 
	 * @param lastname the new lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 * 
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the email.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 * 
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the registrationdate.
	 * 
	 * @return the registrationdate
	 */
	public Date getRegistrationdate() {
		return registrationdate;
	}

	/**
	 * Sets the registrationdate.
	 * 
	 * @param registrationdate the new registrationdate
	 */
	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}
}
