package mail_sender;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Client {
    private int id = 0;
    private String name;
    private int age;
    private Gender sex;
    private String mail;

    public Client(String name, int age, Gender sex, String mail) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
        id = ClientIdGenerator.generateId();
    }

    private static class ClientIdGenerator{
        private static int counter = 0;


        private static int generateId() {
            counter ++;
            return counter;
        }
    }

}
