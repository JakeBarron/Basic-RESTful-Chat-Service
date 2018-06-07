package org.JakeBarron.Cirtual.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message {
	@Id
	@Column(name="message_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long messageId;
	
	@Column(name= "sender")
	private String sender;
	
	@Column(name="payload")
	private String payload;
	
	//getters
	public long getMessageId() {
		return this.messageId;
	}
	
	public String getSender() {
		return this.sender;
	}
	
	public String getPayload() {
		return this.payload;
	}
	
	//setters
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", sender='" + sender + '\'' +
                ", payload='" + payload + '\'' +
                '}';
    }

}
