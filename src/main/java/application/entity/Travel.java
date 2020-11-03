package application.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "travels")
public class Travel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private String destinity_city;
	@Column
	private Date start_date;
	@Column
	private Date end_date;
	@Column
	private String description;

	@ManyToMany
	private List<User> users;

	@OneToMany(mappedBy = "travel")
	private List<Plan> plans;

	public Travel(String name, String destinity_city, Date start_date, Date end_date, String description) {
		super();
		this.name = name;
		this.destinity_city = destinity_city;
		this.start_date = start_date;
		this.end_date = end_date;
		this.description = description;
	}

	public Travel() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestinity_city() {
		return destinity_city;
	}

	public void setDestinity_city(String destinity_city) {
		this.destinity_city = destinity_city;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
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
