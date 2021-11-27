package mail_sender;

import java.io.IOException;
import java.util.HashMap;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String getText() throws IOException {
        HashMap<String, String> template = new HashMap<String, String>();
        template.put("%NAME%", client.getName());
        String text = mailCode.generateText();
        for (String toReplace : template.keySet()) {
            text.replace(toReplace, template.get(toReplace));
        }
        return text;
    }
}
