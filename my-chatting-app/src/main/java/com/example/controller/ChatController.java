import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        chatService.sendMessage(message);
    }

    @GetMapping("/messages")
    public List<Message> fetchMessages() {
        return chatService.fetchMessages();
    }
}