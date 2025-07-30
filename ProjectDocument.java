package pixelforge_nuxus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProjectDocument {
	@Id @GeneratedValue private Long id;
    private String fileName;
    private String filePath;

    @ManyToOne
    private Project project;

}
