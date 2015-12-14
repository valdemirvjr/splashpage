package desafio.geofusion.splashpage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class EmailService
{
    @Autowired
    private MailSender mailSender;

    private String buildEmailMsg()
    {
        return "";

    }

    @Async
    public void sendMail(String toAddress, String fromAddress, String subject, String msgBody)
    {
        if(StringUtils.isEmpty(toAddress) || StringUtils.isEmpty(fromAddress)
                || StringUtils.isEmpty(subject) || StringUtils.isEmpty(msgBody))
        {
            throw new IllegalArgumentException();
        }

        SimpleMailMessage feedbackMail = new SimpleMailMessage();
        feedbackMail.setTo(toAddress);
        feedbackMail.setFrom(fromAddress);
        feedbackMail.setSubject(subject);
        feedbackMail.setText(msgBody);

        mailSender.send(feedbackMail);
    }
}
