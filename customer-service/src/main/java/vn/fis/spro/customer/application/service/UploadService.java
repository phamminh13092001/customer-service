package vn.fis.spro.customer.application.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UploadService {

    List<String> uploadFile(MultipartFile[] files, String path);
}
