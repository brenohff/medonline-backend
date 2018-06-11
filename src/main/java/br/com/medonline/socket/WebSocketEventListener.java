package br.com.medonline.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class WebSocketEventListener {

	private static final Logger logger = LoggerFactory.getLogger(WebSocketEventListener.class);

//	@Autowired
//	private SimpMessageSendingOperations messagingTemplate;

	@EventListener
	public void handleWebSocketConnectListener(SessionConnectedEvent event) {
		logger.info("Received a new web socket connection");
	}

	@EventListener
	public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
		//StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
		logger.info("web socket disconnected.");

//		LTChat chatMessage = (LTChat) headerAccessor.getSessionAttributes().get("chatMessage");
//
//		if (chatMessage != null && chatMessage.getUser().getName() != null) {
//			logger.info("User Disconnected : " + chatMessage.getUser().getName());
//
//			LTChat ltChat = new LTChat();
//			ltChat.setType(LTChat.MessageType.LEAVE);
//			ltChat.setUser(chatMessage.getUser());
//
//			messagingTemplate.convertAndSend("/topic/event/" + chatMessage.getEventId(), ltChat);
//		}
	}
}