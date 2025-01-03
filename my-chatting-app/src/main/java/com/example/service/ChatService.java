public class ChatService {
    
    private List<Message> messages;

    public ChatService() {
        this.messages = new ArrayList<>();
    }

    public List<Message> fetchMessages() {
        return new ArrayList<>(messages);
    }

    public Message sendMessage(String messageContent, String sender) {
        Message newMessage = new Message(messageContent, sender, System.currentTimeMillis());
        messages.add(newMessage);
        return newMessage;
    }
}