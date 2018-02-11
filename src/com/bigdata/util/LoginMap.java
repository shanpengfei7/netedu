package com.bigdata.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class LoginMap {
	public String loginOrReturn(String value) {
		final Map<String, String> map = new HashMap<String, String>();
		map.put("key", value);

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				map.remove("key");
			}
		};
		timer.schedule(task, 10000);
		return "key";
	}
}
