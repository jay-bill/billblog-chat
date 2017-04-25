package chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import chat.entity.Message;
import chat.service.ChatService;

@Controller
public class ChatController {
	
	@Autowired
	private ChatService chatService;
	
	/**
	 * 接收消息json数据：{"uid":"","toid":"","message":""};
	 * @param msg
	 */
	@MessageMapping("/receive")
	public void receive(Message msg){
		chatService.forward(msg);
	}
}
