package savefiletoDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import savefiletoDB.model.ProfileImage;
import savefiletoDB.service.ProfileImageService;

@RestController
@CrossOrigin
public class ProfileImageController {

	@Autowired
	private ProfileImageService imageService;
	
	
	@PostMapping(value="/upload")
	public ResponseEntity<String> postImage(ProfileImage profileImage){
		ProfileImage pi = imageService.get(profileImage.getUsername());
		if(pi!= null) {
			return new ResponseEntity<String>(HttpStatus.CONFLICT);
		}else {
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}
	}
	
	@GetMapping(value="/download/{username}")
	public ResponseEntity<ProfileImage> getData(@PathVariable("username") String username){
	return new ResponseEntity<ProfileImage>(imageService.get(username),HttpStatus.OK);
	}
}