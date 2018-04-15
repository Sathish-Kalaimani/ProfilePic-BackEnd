package savefiletoDB.service;

import org.springframework.stereotype.Service;

import savefiletoDB.model.ProfileImage;
import savefiletoDB.repository.ProfileImageRepository;

@Service
public class ProfileImageServiceImpl implements ProfileImageService{

	
	private ProfileImageRepository imageRepository;
	
	@Override
	public boolean save(ProfileImage uploadFile) {
		return (imageRepository.save(uploadFile)!=null);
	}

	public ProfileImage get(String id) {
		return imageRepository.findOne(id);
	}

}
