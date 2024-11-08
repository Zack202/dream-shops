package com.dailycodework.dreamshops.service.image;

import com.dailycodework.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    Image saveImages(List<MultipartFile> file, Long productId);
    void updateImage(MultipartFile file, Long imageId);

}
