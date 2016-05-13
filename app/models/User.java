/**
 * 
 */
package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
@Entity
@Table(name="user")
public class User extends Model{

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="user")
	private List<CreditCard> creditCards;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="user")
	private List<Order> orders;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="user")
	private List<Address> addresses;
	
	@Column(name="user_name", unique=true)
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="last_login")
	private Date lastLogin;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="is_admin")
	private boolean isAdmin;
}
