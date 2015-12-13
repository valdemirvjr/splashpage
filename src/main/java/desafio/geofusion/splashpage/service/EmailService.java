package desafio.geofusion.splashpage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService
{
    @Autowired
    private MailSender mailSender;

    @Async
    public void sendMail(String toAddress, String fromAddress, String subject, String msgBody)
    {
        SimpleMailMessage feedbackMail = new SimpleMailMessage();
        feedbackMail.setTo(toAddress);
        feedbackMail.setFrom(fromAddress);
        feedbackMail.setSubject(subject);
        feedbackMail.setText(msgBody);

        mailSender.send(feedbackMail);
    }

}
