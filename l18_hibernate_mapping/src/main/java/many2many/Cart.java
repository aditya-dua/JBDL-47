package many2many;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="jbdl-47-mapping-M2M-cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cart_id")
	private long id;
	
	@Column(name="cart_total")
	private long total;

	
	@ManyToMany(targetEntity = Item.class, cascade = { CascadeType.ALL })
	@JoinTable(name = "jbdl-47-mapping-M2M-cart-item-mapping",
			joinColumns = {@JoinColumn(name="cart_id")},
			inverseJoinColumns = {@JoinColumn(name="item_id")}
			)
	private Set<Item> items;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getTotal() {
		return total;
	}


	public void setTotal(long total) {
		this.total = total;
	}


	public Set<Item> getItems() {
		return items;
	}


	public void setItems(Set<Item> items) {
		this.items = items;
	}


	public Cart(long id, long total, Set<Item> items) {
		super();
		this.id = id;
		this.total = total;
		this.items = items;
	}


	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", items=" + items + "]";
	}
	
	
}
