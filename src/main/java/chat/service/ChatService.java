package chat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

import chat.entity.Message;

@Service
public class ChatService {
	//简单的文本回应类，使用该对象可以在任意地方回复消息到某个主题
	@Autowired
	private SimpMessageSendingOperations messaging;
	
	/**
	 * 转发消息到相应的用户
	 * @param msg
	 */
	public void forward(Message msg){
		String toid = msg.getToid();
		//将消息发送到topic下的和对方id一致的目录下
		messaging.convertAndSend("/topic/"+toid, msg);
	}
}
