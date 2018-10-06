package in.java.colletions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class User_Defined_Objects {
	public static void main(String[] args) {
		Map<UserKey, UserValue> hm = new HashMap<>();
		
		UserKey uk = new UserKey();
		uk.setUkey(1);
		UserKey uk1 = new UserKey();
		uk1.setUkey(2);
		UserKey uk2 = new UserKey();
		uk2.setUkey(3);
		UserKey uk3 = new UserKey();
		uk3.setUkey(4);
		
		UserValue uv = new UserValue();
		uv.setName("Mani");
		UserValue uv1 = new UserValue();
		uv1.setName("Mani1");
		UserValue uv2 = new UserValue();
		uv2.setName("Mani1...........");
		UserValue uv3 = new UserValue();
		uv3.setName("...........");

		hm.put(uk, uv);
		hm.put(uk1, uv1);
		hm.put(uk2, uv2);
		hm.put(uk3, uv3);

		for (Map.Entry<UserKey, UserValue> i : hm.entrySet()) {

			UserKey key = i.getKey();
			UserValue value = i.getValue();
			System.out.println(key.getUkey() + " " + value.getName());
		}
		 /*TreeMap<UserKey, UserValue> tm = new TreeMap<UserKey, UserValue>();
		 tm.put(uk, uv);
			tm.put(uk1, uv1);
			tm.put(uk2, uv2);
			tm.put(uk3, uv3);
			System.out.println(tm);*/
	}
}

class UserValue {
	String Name = null;
	
	public String getName() {
		return Name;
	}
	void setName(String name) {
		this.Name = name;
	}
}

class UserKey {
	int ukey = 0;
	int getUkey() {
		return ukey;
	}
	void setUkey(int ukey) {
		this.ukey = ukey;
	}
}