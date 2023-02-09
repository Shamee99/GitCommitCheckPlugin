package com.ruijie.shamee.gitcc.utils;

import com.intellij.notification.*;
import com.intellij.openapi.ui.MessageType;


/**
 * 弹窗消息工具类
 * @author Shamee Loop
 */
public class NotificationUtils {

    public static void notifyMessage(String msg, NotificationType notificationType){
        // 添加NotificationGroup，指定消息通知类型。这里NotificationDisplayType.BALLOON表示为气泡类型
        // isLogByDefault设置为true，表示除了消息气泡通知还会出发Idea事件通知
        NotificationGroup notificationGroup = new NotificationGroup("gitcc_dutang.id", NotificationDisplayType.BALLOON, false);

        // 在NotificationGroup中添加消息通知内容，以及消息类型。NotificationType.INFO
        Notification notification = notificationGroup.createNotification(DutangUtils.getDutang(), msg, notificationType, null);

        // 消息通知
        Notifications.Bus.notify(notification);
    }
}
