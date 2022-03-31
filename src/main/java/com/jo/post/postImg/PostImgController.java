package com.jo.post.postImg;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@AllArgsConstructor
public class PostImgController {

    private S3Service s3Service;
    private PostImgService postImgService;


    @GetMapping("/postImg")
    public String dispWrite(Model model) {
        List<PostImgDto> postImgDtoList = postImgService.getPostImgList();

        model.addAttribute("postImgList", postImgDtoList);

        return "/postImg";
    }

    @PostMapping("/postImg")
    public String execWrite(PostImgDto postImgDto, MultipartFile file) throws IOException {
        String imgPath = s3Service.upload(postImgDto.getUrl(), file);
        postImgDto.setUrl(imgPath);

        postImgService.savePost(postImgDto);

        return "redirect:/postImg";
    }
}
