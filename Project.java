package pixelforge_nuxus;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project {
	@Id @GeneratedValue private Long id;
    private String name;
    private String description;
    private LocalDate deadline;
    private boolean completed;

    @ManyToOne
    private User lead;

    @ManyToMany
    private List<User> developers;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<ProjectDocument> documents;

}
