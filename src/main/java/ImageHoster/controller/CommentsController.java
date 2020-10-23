package ImageHoster.controller;

import ImageHoster.model.Image;
import ImageHoster.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CommentsController {

    @Autowired
    private ImageService imageService;

    @RequestMapping(value = "/image/{imageId}/{imageTitle}/comments", method = RequestMethod.POST)
    public String getAllImages(@PathVariable("imageId") String imageId, @PathVariable("imageTitle") String imageTitle, Model model) {
        List<Image> images = imageService.getAllImages();
        model.addAttribute("images", images);
        return "index";
    }
}
