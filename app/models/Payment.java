/**
 * 
 */
package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
@Entity
@Table(name="payment")
public class Payment extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="payment_id")
	private Long paymentId;
	
	@Column(name="order_id")
	private Order order;
	
	@Column(name="status")
	private String status;
	
	@Column(name="authorization_id")
	private String authorizationId;
	
	@Column(name="refund_id")
	private String refundId;
	
	@Column(name="auth_date")
	private Date authorizationDate;
	
	@Column(name="payment_date")
	private Date paymentDate;
	
	@Column(name="void_date")
	private Date voidDate;
}
