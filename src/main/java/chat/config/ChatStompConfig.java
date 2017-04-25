package chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class ChatStompConfig  extends AbstractWebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		//stomp连接端点
		registry.addEndpoint("/chatServer").withSockJS();
	}
	//配置简单消息代理
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry){
		//消息代理会处理前缀为"/queue"、"/topic"的消息
		registry.enableSimpleBroker("/queue","/topic");
		//应用程序的消息会带有"/app"前缀
		registry.setApplicationDestinationPrefixes("/app");
	}
}
