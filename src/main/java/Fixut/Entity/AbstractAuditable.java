package Fixut.Entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractAuditable extends BaseEntity {

	@Version
	protected Date dateCreated;

	@Version
	protected Date dateLastUpdated;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "created_by")
    private User createdBy;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "last_updated_by")
    private User lastUpdatedBy;
    
    @Transient
    private boolean disableAudit = false;
    
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}

	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public User getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(User lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public boolean isDisableAudit() {
		return disableAudit;
	}

	public void setDisableAudit(boolean disableAudit) {
		this.disableAudit = disableAudit;
	}
}
