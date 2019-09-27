package anno2_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("aa")
//@Component("senderProcess")
//@Component
@Service
//@ComponentScan("anno2_auto")
public class SenderProcess { //BL
	@Autowired	//type에 의한 mapping
	private Sender sender;
	
	/*
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	*/
	
	
	public Sender getSender() {
		return sender;
	}

	public void dispData() {
		sender.show();
	}
	

}
