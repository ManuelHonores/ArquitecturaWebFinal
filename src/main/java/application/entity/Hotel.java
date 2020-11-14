package application.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "hotels")
public class Hotel extends Plan{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private Integer day_start_date;
	@Column
	private Integer month_start_date;
	@Column
	private Integer year_start_date;
	@Column
	private Integer day_end_date;
	@Column
	private Integer month_end_date;
	@Column
	private Integer year_end_date;

	public Hotel(String name, String description, boolean finished, String country, Integer day_start_date, Integer month_start_date, Integer year_start_date, Integer day_end_date, Integer month_end_date, Integer year_end_date) {
		this.name = name;
		this.description = description;
		this.finished = finished;
		this.country = country;
		this.day_start_date = day_start_date;
		this.month_start_date = month_start_date;
		this.year_start_date = year_start_date;
		this.day_end_date = day_end_date;
		this.month_end_date = month_end_date;
		this.year_end_date = year_end_date;
	}

	public Hotel() {
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public Integer getDay_start_date() {
		return day_start_date;
	}

	public void setDay_start_date(Integer day_start_date) {
		this.day_start_date = day_start_date;
	}

	public Integer getMonth_start_date() {
		return month_start_date;
	}

	public void setMonth_start_date(Integer month_start_date) {
		this.month_start_date = month_start_date;
	}

	public Integer getYear_start_date() {
		return year_start_date;
	}

	public void setYear_start_date(Integer year_start_date) {
		this.year_start_date = year_start_date;
	}

	public Integer getDay_end_date() {
		return day_end_date;
	}

	public void setDay_end_date(Integer day_end_date) {
		this.day_end_date = day_end_date;
	}

	public Integer getMonth_end_date() {
		return month_end_date;
	}

	public void setMonth_end_date(Integer month_end_date) {
		this.month_end_date = month_end_date;
	}

	public Integer getYear_end_date() {
		return year_end_date;
	}

	public void setYear_end_date(Integer year_end_date) {
		this.year_end_date = year_end_date;
	}
}
