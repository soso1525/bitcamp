package java100.app.web.v02;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/v02/test13")
public class Test13 {

    @RequestMapping
    public String fileupload(@RequestParam("name") String name, @RequestParam("age") int age,
            @RequestParam(value = "working") boolean working, @RequestParam("photo") MultipartFile file)
            throws IOException {
        if (file.isEmpty())
            return null;
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(file.getOriginalFilename());

        return "/hello.jsp";
    }
}
