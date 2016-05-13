package models;

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


@Entity
@Table(name="cart")
public class Cart extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cart_id")
	private Long cartId;

	@OneToOne(targetEntity=User.class, fetch = FetchType.EAGER)
	@JoinColumn(name="user")
	private User user;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="cart")
	private List<LineItem> lineItems;
	
	@Column(name="cost")
	private Integer cost;

}
