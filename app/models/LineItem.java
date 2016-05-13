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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
@Entity
@Table(name="line_item")
public class LineItem extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_id")
	private Long itemId;
	
	@JoinColumn(name="sku_id", unique=false)
	@OneToOne(targetEntity=Item.class, fetch=FetchType.LAZY)
	private Item item;
	
	@ManyToOne(targetEntity=Cart.class, fetch=FetchType.LAZY)
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	@ManyToOne(targetEntity=Order.class, fetch=FetchType.LAZY)
	@JoinColumn(name="order_id")
	private Order order;
	
	@Column(name="cost")
	private Double cost;

}
