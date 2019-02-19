package Fixut.Entity;

import Fixut.Enumerations.Status;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {
	@Id
	@GeneratedValue
	protected Long id;

	@Enumerated(EnumType.STRING)
	protected Status status = Status.V;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof BaseEntity)) {
			return false;
		}
	 
		BaseEntity other = (BaseEntity) object;
	 	if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	 		return false;
	 	}
	 	return true;
	}	
	
//	@PrePersist
//	void onCreate() {
//		if (this instanceof AbstractAuditable) {
//			AbstractAuditable entity = (AbstractAuditable ) this;
//			if (!entity.isDisableAudit()) {
//				Date now = new Date();
//				User user = Utils.getCurrentUserNE();
//				entity.setDateCreated(now);
//				entity.setDateLastUpdated(now);
//				if (user != null) {
//					entity.setCreatedBy(user);
//					entity.setLastUpdatedBy(user);
//				}
//			}
//		}
//	}
//
//	@PreUpdate
//	void onPersist() {
//		if (this instanceof AbstractAuditable) {
//			AbstractAuditable entity = (AbstractAuditable ) this;
//			if (!entity.isDisableAudit()) {
//				Date now = new Date();
//				User user = Utils.getCurrentUserNE();
//				entity.setDateLastUpdated(now);
//				if (user != null) {
//					entity.setLastUpdatedBy(user);
//				}
//			}
//		}
//	}
}
