package pixelforge_nuxus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	 @Autowired private ProjectService projectService;

	    @PostMapping("/add")
	    @PreAuthorize("hasRole('ADMIN')")
	    public ResponseEntity<Project> addProject(@RequestBody ProjectDto dto) {
	        return ResponseEntity.ok(projectService.createProject(dto));
	    }

	    @GetMapping("/all")
	    public ResponseEntity<List<Project>> getAll() {
	        return ResponseEntity.ok(projectService.getAll());
	    }

}
