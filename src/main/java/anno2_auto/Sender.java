package anno2_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Component("sender") //같은 뜻
//@Scope("singleton")
public class Sender {
	
	public void show() {
		System.out.println("show 메소드 수행");
	}
}
