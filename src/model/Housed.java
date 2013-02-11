/*******************************************************************************
 *
 *  Copyright 2011 - Sardegna Ricerche, Distretto ICT, Pula, Italy
 *
 * Licensed under the EUPL, Version 1.1.
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *  http://www.osor.eu/eupl
 *
 * Unless required by applicable law or agreed to in  writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 * In case of controversy the competent court is the Court of Cagliari (Italy).
 *******************************************************************************/
package model;

import java.io.Serializable;
import java.util.Date;

import model.questura.HousedType;

import javax.xml.bind.annotation.XmlRootElement;



import org.apache.solr.client.solrj.beans.Field;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Housed implements Serializable{
	@Field
	private Integer id;
	@Field
	private Integer idBooking;
	private Guest guest;
	private HousedType housedType;

	private Date checkInDate;
	private Date checkOutDate;
	
	private Boolean exported;
	private Boolean deleted;
	
	private String idSired;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Housed other = (Housed) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	public HousedType getHousedType() {
		return housedType;
	}
	public void setHousedType(HousedType type) {
		this.housedType = type;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date date) {
		this.checkInDate = date;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date date) {
		this.checkOutDate = date;
	}
	public Integer getIdBooking() {
		return idBooking;
	}
	public void setIdBooking(Integer idBooking) {
		this.idBooking = idBooking;
	}
	public Boolean getExported() {
		return exported;
	}
	public void setExported(Boolean exported) {
		this.exported = exported;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public String getIdSired() {
		return idSired;
	}
	public void setIdSired(String idSired) {
		this.idSired = idSired;
	}
	
}