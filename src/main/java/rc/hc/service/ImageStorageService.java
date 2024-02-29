package rc.hc.service;

import java.io.IOException;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import rc.hc.model.ImageStorage;
import rc.hc.repo.ImageStorageRepository;
import rc.hc.utils.ImageUtil;
@Service
public class ImageStorageService {

	@Autowired
	private ImageStorageRepository imageStorageRepository;
	@Transactional
	public String uplaodFile(MultipartFile file) throws IOException {
		ImageStorage imageStorage = new ImageStorage();
		imageStorage.setName(file.getOriginalFilename());
		imageStorage.setType(file.getContentType());
		imageStorage.setImagedata(ImageUtil.compressImage(file.getBytes()));
		imageStorageRepository.save(imageStorage);
		if(imageStorage!=null) {
			return "File Uploaded succesfully "+file.getOriginalFilename();
		}
		return "File Not Uploaded";
	}
	@Transactional
	public byte[] dowmloadFile (String fileName) {
		Optional<ImageStorage> dbImage = imageStorageRepository.findByName(fileName);
		return ImageUtil.decompressImage(dbImage.get().getImagedata());
	}
			
}
