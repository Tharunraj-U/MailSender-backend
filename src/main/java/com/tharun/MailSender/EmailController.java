package com.tharun.MailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestBody Pojo pojo){
        emailService.sendSimpleMail(pojo.getTo(),pojo.getSubject(),pojo.getText());
        return "Email send Successfully";
    }
}
