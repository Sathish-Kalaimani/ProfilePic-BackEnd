package savefiletoDB.service;

import savefiletoDB.model.ProfileImage;

public interface ProfileImageService {

	public boolean save(ProfileImage uploadFile);
	
	public ProfileImage get(String id);
	
}
