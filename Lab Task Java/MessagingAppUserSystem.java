public class MessagingAppUserSystem {
    String userName;
    String[] messages = new String[10];
    int messageCount = 0; 

    void sendMessage(String message) {
        if (messageCount >= 10) {
            System.out.println("Message box full. Cannot send message");
        }
        else {
            messages[messageCount] = message;
            messageCount++;
        } 
    }
    void deleteMessage(int index) {
        if (index < 0 || index >= messageCount) {
            System.out.println("Invalid message index.");
        }
        else {
            for (int i = index; i < messages.length-1; i++) {
                messages[i] = messages[i+1];
            }
            messages[messages.length-1] = null;
            messageCount--;
        }
    }
    void displayMessages() {
        if (messageCount == 0) {
            System.out.println("No messages to display");
        }
        for (int i = 0; i < messageCount; i++) {
            System.out.println(i + " : " + messages[i]);
        }
    }
}
