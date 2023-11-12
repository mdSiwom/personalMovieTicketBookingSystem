import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class IDandPasswords {

	HashMap<String, String> logininfo = new HashMap<String, String>();

	IDandPasswords() {
		logininfo.put("Bro", "pizza");
		logininfo.put("Brometheus", "PASSWORD");
		logininfo.put("BroCode", "abc123");
	}

	public HashMap getLoginInfo() {
		return logininfo;
	}

}
