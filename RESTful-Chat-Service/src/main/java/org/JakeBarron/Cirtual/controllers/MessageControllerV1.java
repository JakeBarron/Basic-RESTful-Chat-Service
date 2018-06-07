package org.JakeBarron.Cirtual.controllers;

import java.util.List;

import org.JakeBarron.Cirtual.domains.Message;
import org.JakeBarron.Cirtual.managers.MessageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.JakeBarron.Cirtual.managers.MessageManager;

public class MessageControllerV1 {
    @Autowired
    private MessageManager messageManager;
    
    @RequestMapping(method = RequestMethod.POST)
    Message send(@RequestBody Message message) {
    	Message response = messageManager.send(message);
    	return response;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Message> getMessages() {
        return messageManager.getMessages();
    }

}
