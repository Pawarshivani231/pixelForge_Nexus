package pixelforge_nuxus;

import java.util.List;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	  @Id @GeneratedValue private Long id;
	    private String username;
	    private String password;

	    @Enumerated(EnumType.STRING)
	    private Role role; // ADMIN, PROJECT_LEAD, DEVELOPER

	    @OneToMany(mappedBy = "assignedUser")
	    private List<Project> projects;
	}


