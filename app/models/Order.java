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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
@Entity
@Table(name="order")
public class Order extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="order_id")
	private Long orderId;
	
	@OneToOne(targetEntity=User.class, fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="order")
	private List<LineItem> lineItems;
	
	@Column(name="status")
	private String status;
	
	@Column(name="order_cost")
	private Double orderCost;
	
	@Column(name="cancelled_by")
	private String cancelledBy;
	
	@Column(name="cancellation_date")
	private Date cancellationDate;
	
	@Column(name="comments")
	private String comments;
	
	@OneToOne(targetEntity=Address.class, fetch=FetchType.LAZY)
	@JoinColumn(name="address_id")
	private Address address;

}
