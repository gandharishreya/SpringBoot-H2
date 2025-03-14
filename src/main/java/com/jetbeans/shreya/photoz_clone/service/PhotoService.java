package com.jetbeans.shreya.photoz_clone.service;

import com.jetbeans.shreya.photoz_clone.model.Photo;
import com.jetbeans.shreya.photoz_clone.repository.PhotoRepository;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }


    public Iterable<Photo> get() {
        return photoRepository.findAll();
    }

    public Photo get(Integer id) {
        return photoRepository.findById(id).orElse(null);
        
    }

    public void remove(Integer id) {
         photoRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo=new Photo();
        photo.setContentType(contentType);

        photo.setFileName(fileName);

        photo.setData(data);
        photoRepository.save(photo);
        return photo;
    }



}
