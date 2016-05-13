/**
 * 
 */
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
@Entity
@Table(name="address")
public class Address extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	private Long addressId;
	
	@ManyToOne(targetEntity=User.class, fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="line1")
	private String line1;
	
	@Column(name="line2") 
	private String line2;
	
	@Column(name="line3")
	private String line3;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state") 
	private String state;
	
	@Column(name="pin_code")
	private String pinCode;
	
	@Column(name="phone") 
	private String phone;

}
