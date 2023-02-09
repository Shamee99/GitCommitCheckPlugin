package com.ruijie.shamee.gitcc.component;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.json.JSONUtil;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.components.ApplicationComponent;
import com.ruijie.shamee.gitcc.datacenter.DataCenter;
import com.ruijie.shamee.gitcc.utils.FilesUtils;
import com.ruijie.shamee.gitcc.utils.NotificationUtils;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * idea启动时，开线程校验当前时间，是否到了提醒时间。如果是，检查git提交记录。并发送提醒
 * @author Shamee Loop
 */
public class GitCCApplicationComponent implements ApplicationComponent {

    @Override
    public void initComponent() {
        ThreadUtil.execAsync(() -> {
            while(true) {
                // 17:00提醒
                out: if(isTriggering()){
                    String string = FileUtil.readString(FilesUtils.getDataCenterJsonFile(), StandardCharsets.UTF_8);
                    DataCenter dataCenter = JSONUtil.toBean(string, DataCenter.class);
                    if(dataCenter != null){
//                        NotificationUtils.notifyMessage(string);
                        NotificationUtils.notifyMessage("骚年，今天还未提交代码。准备留着过年吗？", NotificationType.ERROR);

                        // 延迟1分钟5秒在执行，避免一分钟内重复发；简单粗暴处理
                        ThreadUtil.sleep(1 * 60 * 1000 + 3000);
                        break out;
                    }
                } else {
                }
            }
        });


        ScheduledThreadPoolExecutor executor = ThreadUtil.createScheduledExecutor(1);
        ThreadUtil.schedule(executor, () -> {
            /**
             * 每小时提示注意休息了
             */
            NotificationUtils.notifyMessage("~~~~长时间久坐，休息一下吧~~~~", NotificationType.INFORMATION);
        },0, 1, TimeUnit.HOURS, true);
    }

    private boolean isTriggering(){
        int minute = DateUtil.thisMinute();
        int hour = DateUtil.thisHour(true);
        if(hour == 17 && minute == 00){
            return true;
        }
        return false;
    }

}
