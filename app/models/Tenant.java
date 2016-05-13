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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
@Entity
@Table(name="tenant")
public class Tenant extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tenant_id")
	private Long tenantId;
	
	@OneToOne(targetEntity=Layout.class, fetch=FetchType.LAZY)
	@JoinColumn(name="layout_id")
	private Layout layout;
	
	@OneToOne(targetEntity=Config.class, fetch=FetchType.LAZY)
	@JoinColumn(name="config_id")
	private Config config;
}
