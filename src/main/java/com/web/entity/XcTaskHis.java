package com.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.ToString;

/**
 * Created by mrt on 2018/4/4.
 */
@Data
@ToString
@Entity
@Table(name = "xc_task_his")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class XcTaskHis implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String id;

    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "delete_time")
    private Date deleteTime;
    @Column(name = "task_type")
    private String taskType;
    @Column(name = "mq_exchange")
    private String mqExchange;
    @Column(name = "mq_routingkey")
    private String mqRoutingkey;
    @Column(name = "request_body")
    private String requestBody;
    private String version;
    private String status;
}
