package com.github.kfcfans.oms.server.common.constans;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 任务状态
 *
 * @author tjq
 * @since 2020/4/6
 */
@Getter
@AllArgsConstructor
public enum JobStatus {

    ENABLE(1),
    STOPPED(2),
    DELETED(99);

    private int v;

}
