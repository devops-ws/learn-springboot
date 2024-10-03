package io.github.devopsws.demo.service;

import java.io.FileOutputStream;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.github.devopsws.demo.model.Message;

@RestController
@RequestMapping("/upload")
public class FileService {
    @PostMapping("/")
    public Message<?> upload(@RequestParam("file") MultipartFile file) {
        System.out.println("Received file uploading request");
        Message<String> message = new Message<String>();
        if (!file.isEmpty()) {
            String filename = file.getOriginalFilename();
            try (FileOutputStream out = new FileOutputStream(filename)) {
                System.out.println("Uploading file size: " + file.getSize() + ", name: " + filename);

                FileCopyUtils.copy(file.getInputStream(), out);

                message.setMessage("ok");
            } catch (Exception e) {
                message.setMessage(e.getMessage());
            }
        } else {
            message.setMessage("file is empty");
        }
        return message;
    }
}
