package com.keomagroup.bodas.bodasapi.services.serviceImpl;

import com.keomagroup.bodas.bodasapi.services.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileSericeImpl implements FileService {
    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {
        /** Getting Name of the File */
        String fileName = file.getOriginalFilename();

        /** Getting the File path */
        String filePath = path + File.separator + fileName;

        /** creating file Object */
        File f = new File(path);
        if(!f.exists()){
            f.mkdir();
        }

        /** Copying/Uploading the File*/
        Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING); //This Last Option depends on How shold the App works - replace or keep both files
        return fileName;
    }

    @Override
    public InputStream getResourceFile(String path, String fileName) throws FileNotFoundException {
        String filePath = path + File.separator + fileName;
        return new FileInputStream(filePath);
    }
}
