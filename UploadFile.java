package pixelforge_nuxus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class UploadFile {
	@PostMapping("/{projectId}/upload")
	@PreAuthorize("hasAnyRole('ADMIN','PROJECT_LEAD')")
	public ResponseEntity<String> uploadFile(@PathVariable Long projectId,
	    @RequestParam("file") MultipartFile file) {
	    
	    return ResponseEntity.ok(fileService.upload(projectId, file));
	}

}
