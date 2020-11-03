package application.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "flies")
public class Fly extends Plan{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String company;
	@Column
	private Date departure_date;
	@Column
	private int departure_hour;
	@Column
	private String departure_airport;
	@Column
	private Date return_date;
	@Column
	private int return_hour;
	@Column
	private String return_airport;
	@Column
	private String reserve_code;
	@Column
	private String info_airplane;
	@Column
	private int scale_time;
	
	public Fly(String company, Date departure_date, int departure_hour, String departure_airport, Date return_date,
			int return_hour, String return_airport, String reserve_code, String info_airplane, int scale_time) {
		super();
		this.company = company;
		this.departure_date = departure_date;
		this.departure_hour = departure_hour;
		this.departure_airport = departure_airport;
		this.return_date = return_date;
		this.return_hour = return_hour;
		this.return_airport = return_airport;
		this.reserve_code = reserve_code;
		this.info_airplane = info_airplane;
		this.scale_time = scale_time;
	}
	
	public Fly() {
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

	public int getDeparture_hour() {
		return departure_hour;
	}

	public void setDeparture_hour(int departure_hour) {
		this.departure_hour = departure_hour;
	}

	public String getDeparture_airport() {
		return departure_airport;
	}

	public void setDeparture_airport(String departure_airport) {
		this.departure_airport = departure_airport;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public int getReturn_hour() {
		return return_hour;
	}

	public void setReturn_hour(int return_hour) {
		this.return_hour = return_hour;
	}

	public String getReturn_airport() {
		return return_airport;
	}

	public void setReturn_airport(String return_airport) {
		this.return_airport = return_airport;
	}

	public String getReserve_code() {
		return reserve_code;
	}

	public void setReserve_code(String reserve_code) {
		this.reserve_code = reserve_code;
	}

	public String getInfo_airplane() {
		return info_airplane;
	}

	public void setInfo_airplane(String info_airplane) {
		this.info_airplane = info_airplane;
	}

	public int getScale_time() {
		return scale_time;
	}

	public void setScale_time(int scale_time) {
		this.scale_time = scale_time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
