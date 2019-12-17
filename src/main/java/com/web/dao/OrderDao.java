package com.web.dao;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.XcTask;

public interface OrderDao extends JpaRepository<XcTask, String>{

	Page<XcTask> findByUpdateTimeBefore(Pageable pageable,Date updateTime);
}
