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
@Table(name="credit_card")
public class CreditCard extends Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cc_id")
	private Long ccId;
	
	@ManyToOne(targetEntity=User.class, fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="cc_number")
	private String ccNumber;
	
	@Column(name="cvv") 
	private String cvv;
	
	@Column(name="expiry_month")
	private String expiryMonth;
	
	@Column(name="expiry_year")
	private String expiryYear;
	
	@Column(name="paypal_id") 
	private String payPalId;
	
	@Column(name="type")
	private String type;
	
	@Column(name="phone") 
	private String phone;

}
