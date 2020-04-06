package com.github.kfcfans.oms.server.persistence.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 任务信息表
 *
 * @author tjq
 * @since 2020/3/29
 */
@Data
@Entity
@Table(name = "job_info", indexes = {@Index(columnList = "appId")})
public class JobInfoDO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* ************************** 任务基本信息 ************************** */
    // 任务名称
    private String jobName;
    // 任务描述
    private String jobDescription;
    // 任务所属的应用ID
    private Long appId;
    // 任务自带的参数
    private String jobParams;

    /* ************************** 定时参数 ************************** */
    // 时间表达式类型（CRON/API/FIX_RATE/FIX_DELAY）
    private Integer timeExpressionType;
    // 时间表达式，CRON/NULL/LONG/LONG
    private String timeExpression;

    /* ************************** 执行方式 ************************** */
    // 执行类型，单机/广播/MR
    private Integer executeType;
    // 执行器类型，Java/Shell
    private Integer processorType;
    // 执行器信息
    private String processorInfo;

    /* ************************** 运行时配置 ************************** */
    // 最大同时运行任务数，默认 1
    private Integer maxInstanceNum;
    // 并发度，同时执行某个任务的最大线程数量
    private Integer concurrency;
    // 任务整体超时时间
    private Long instanceTimeLimit;
    // 任务的每一个Task超时时间
    private Long taskTimeLimit;

    /* ************************** 重试配置 ************************** */
    private Integer instanceRetryNum;
    private Integer taskRetryNum;

    // 1 正常运行，2 停止（不再调度）
    private Integer status;
    // 下一次调度时间
    private Long nextTriggerTime;


    private Date gmtCreate;
    private Date gmtModified;

}
