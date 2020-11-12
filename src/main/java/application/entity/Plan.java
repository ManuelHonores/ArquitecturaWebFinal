package application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name= "plans")
public class Plan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	@Column
	protected String name;
	@Column
	protected String description;
	@Column
	protected boolean finished;
	@Column
	protected String country;
	
	@ManyToOne
	private Travel travel;
	
	public Plan(String name, String description, boolean finished, String country) {
		super();
		this.name = name;
		this.description = description;
		this.finished = finished;
		this.country = country;
	}
	
	public Plan() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
