package com.web.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.web.dao.OrderDao;
import com.web.entity.XcTask;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	
	public List<XcTask> getTask(Date updateTime,int size){
		Pageable pageable = PageRequest.of(0, size);
		return orderDao.findByUpdateTimeBefore(pageable, updateTime).getContent();
	}
}
