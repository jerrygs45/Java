/*
    The D principle of the SOLID principle stands for Dependency Inversion Principle (DIP). In this
    High-level modules should not depend on low-level modules.
    Both should depend on abstractions (interfaces or abstract classes).
    Abstractions should not depend on details; details should depend on abstractions.

*/

// Below is the incorrect impelementation of DIP -
// class EmailSender {
//     void send(String message) {
//         System.out.println("Email sent: " + message);
//     }
// }

// class NotificationService {
//     EmailSender emailSender = new EmailSender();  // directly depends on EmailSender

//     void notifyUser(String message) {
//         emailSender.send(message);
//     }
// }

// public class DIPDemoSimple {
//     public static void main(String[] args) {
//         NotificationService service = new NotificationService();
//         service.notifyUser("Hello!");
//     }
// }

// Below is the correct implementation of DIP -

// Abstraction
interface MessageSender {
    void send(String message);
}

// Low-level implementations
class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

// High-level module
class NotificationService {
    private final MessageSender sender; // depends on abstraction

    NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void notifyUser(String message) {
        sender.send(message);
    }
}

public class Dprinciple {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        MessageSender sms = new SmsSender();

        NotificationService service1 = new NotificationService(email);
        service1.notifyUser("Hello via Email!");

        NotificationService service2 = new NotificationService(sms);
        service2.notifyUser("Hello via SMS!");
    }
}
