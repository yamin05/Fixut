package Fixut.Entity;

import Fixut.Enumerations.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.*;

@Entity
@Table(name = "t_user")
@JsonIgnoreProperties({
        "authorities",
        "email",
        "roles",
        "username",
        "active",
        "enabled",
        "password",
        "accountNonExpired",
        "accountNonLocked",
        "credentialsNonExpired",
        "dateCreated",
        "dateLastUpdated",
        "createdBy",
        "lastUpdatedBy",
        "disableAudit",
        "status"
})
public class User extends AbstractAuditable implements UserDetails {
    private static final long serialVersionUID = 1L;

    private String email;
    private String name;
    private String password;
    private Boolean active = false;
    private String roles = "";
    private Date dateLastActivity;
    private Long watchGroupId;

    @Transient
    private Set<GrantedAuthority> grantedAuthorities;

    public User(String username, String password, List<GrantedAuthority> grantList) {
        this.name = username;

    }

    public Long getWatchGroupId() {
        return watchGroupId;
    }

    public void setWatchGroupId(Long watchGroupId) {
        this.watchGroupId = watchGroupId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Date getDateLastActivity() {
        return dateLastActivity;
    }

    public void setDateLastActivity(Date dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    @Override
    @Transient
    public Collection<GrantedAuthority> getAuthorities() {
        if (this.grantedAuthorities == null) {
            this.grantedAuthorities = new HashSet<GrantedAuthority>();
            if (this.roles != null) {
                String[] roles = this.roles.split(",");
                for (String role : roles) {
                    if (!role.trim().isEmpty()) {
                        this.grantedAuthorities.add(new SimpleGrantedAuthority(role.trim()));
                    }
                }
            }
        }
        return grantedAuthorities;
    }

    @Override
    @Transient
    public String getUsername() {
        return this.email;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return this.active;
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return this.active;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return this.active;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return this.active;
    }

    @Transient
    public boolean hasRole(Role role) {
        String roleTxt = role.toString();
        for (GrantedAuthority ga : this.getAuthorities()) {
            if (ga.getAuthority().equals(roleTxt)) {
                return true;
            }
        }
        return false;
    }

    public void updateWith(User u) {
        this.setName(u.getName());
        this.setRoles(u.getRoles());
        this.setEmail(u.getEmail());
        this.setActive(u.getActive());
        this.setStatus(u.getStatus());
        this.setDateCreated(u.getDateCreated());
        this.setDateLastUpdated(u.getDateLastUpdated());
        this.setCreatedBy(u.getCreatedBy());
        this.setLastUpdatedBy(u.getLastUpdatedBy());
        this.setDateLastActivity(u.getDateLastActivity());
        this.setWatchGroupId(u.getWatchGroupId());
    }
}
