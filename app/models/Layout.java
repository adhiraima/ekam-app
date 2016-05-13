/**
 * 
 */
package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
public class Layout extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="layout_id")
	private Long layoutId;
	
	@Column(name="header")
	private String header;
	
	@Column(name="footer")
	private String footer;
	
	@Column(name="body")
	private String body;
	
	@Column(name="nav_bar")
	private String navBar;
}
