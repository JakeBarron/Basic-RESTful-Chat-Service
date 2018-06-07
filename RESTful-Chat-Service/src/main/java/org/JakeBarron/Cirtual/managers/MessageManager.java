package org.JakeBarron.Cirtual.managers;

import org.JakeBarron.Cirtual.domains.Message;

import java.util.List;

public interface MessageManager {
	Message send(Message message);
	
    List<Message> getMessages();	
	
}
