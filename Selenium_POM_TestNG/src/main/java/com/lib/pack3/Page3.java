package com.lib.pack3;

import java.io.IOException;

import com.lib.pack2.Page2;

public class Page3 extends Page2 {
	
	public String confirm_appointment() {
		return wd.findElement(appointconfirm).getText();
	}
	
	public void ss() throws InterruptedException, IOException {
		c1.implicit_wait(5);
		c1.capture_ss("img1", "Screenshots");
		c1.implicit_wait(5);
		c1.close();
	}

}
