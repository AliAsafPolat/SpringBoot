package io.cdtpservice.cdtp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cdtp")
public class Sera {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String isim;
	
	@Column
	private int hedef_sicaklik;
	
	@Column
	private int guncel_sicaklik;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getHedef_sicaklik() {
		return hedef_sicaklik;
	}

	public void setHedef_sicaklik(int hedef_sicaklik) {
		this.hedef_sicaklik = hedef_sicaklik;
	}

	public int getGuncel_sicaklik() {
		return guncel_sicaklik;
	}

	public void setGuncel_sicaklik(int guncel_sicaklik) {
		this.guncel_sicaklik = guncel_sicaklik;
	}

	@Override
	public String toString() {
		return "Sera [id=" + id + ", isim=" + isim + ", hedef_sicaklik=" + hedef_sicaklik + ", guncel_sicaklik="
				+ guncel_sicaklik + "]";
	}
	
	
	
}
