package com.web.mq;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.web.entity.XcTask;
import com.web.service.OrderService;

@Component
public class ChooseTask {

	@Autowired
	private OrderService service;
	@Scheduled(cron = "*/2 * * * * *")
	public void task1() {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		calendar.set(GregorianCalendar.MINUTE, -1);
		Date time = calendar.getTime();
		List<XcTask> task = service.getTask(time, 3);
		System.out.println("开始遍历");
		for (XcTask xcTask : task) {
			System.out.println(xcTask);
		}
		System.out.println("遍历结束");
	}
}
