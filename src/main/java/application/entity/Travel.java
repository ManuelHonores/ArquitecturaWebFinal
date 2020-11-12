package application.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

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
	// Agrego continente para hacer el reporte por zona geográfica, en este caso, por continente.
	@Column
	private String continent;
	@Column
	private Date start_date;
	@Column
	private Date end_date;
	@Column
	private String description;

	@ManyToOne
	private User user;

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

	public String getContinent() { return continent; }

	public void setContinent(String continent) { this.continent = continent; }

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
