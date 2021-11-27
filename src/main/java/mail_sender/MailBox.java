package mail_sender;

import java.util.HashSet;

public class MailBox {
    private HashSet<MailInfo> infos = new HashSet<MailInfo>();
    private MailSender sender;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        sender = new MailSender();
        for (MailInfo mailInfo : infos) {
            sender.sendMail(mailInfo);
        }
    }
}
