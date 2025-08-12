public class MessagingApp {
    public static void main(String[] args) {
        MessagingAppUserSystem mail = new MessagingAppUserSystem();

        mail.userName = "Maiyan";
        mail.sendMessage("Hello, man");
        mail.sendMessage("How are you");
        mail.displayMessages();
        mail.deleteMessage(1);
        System.out.println("After deletion: ");
        mail.displayMessages();
    }
}
