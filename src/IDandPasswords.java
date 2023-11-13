import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class IDandPasswords {

	User[] logininfo = new User[4];

	IDandPasswords() {
		this.logininfo[0] = new User("Anika", "123");
		this.logininfo[1] = new User("Ebadi", "123");
		this.logininfo[2] = new User("Rose", "123");
		this.logininfo[3] = new User("a", "a");
	}

	public User[] getLoginInfo() {
		return logininfo;
	}

}
