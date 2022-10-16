package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class StorageService {

    @Autowired
    private StorageRepository repository;
    
    private static final Logger logger = LoggerFactory.getLogger(StorageService.class);

    public String uploadImage(MultipartFile file) throws IOException {
    	
    	logger.debug("uploadImage : file name ::  {}", file.getName());

        ImageData imageData = repository.save(ImageData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtils.compressImage(file.getBytes())).build());
        if (imageData != null) {
            return "file uploaded successfully : " + file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadImage(String fileName){
    	logger.debug("downloadImage : fileName ::  {}", fileName);
        Optional<ImageData> dbImageData = repository.findByName(fileName);
        byte[] images=ImageUtils.decompressImage(dbImageData.get().getImageData());
        return images;
    }
}
