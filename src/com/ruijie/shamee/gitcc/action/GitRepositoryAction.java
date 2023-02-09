package com.ruijie.shamee.gitcc.action;

import com.intellij.notification.NotificationType;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;
import com.ruijie.shamee.gitcc.utils.NotificationUtils;


/**
 * 检查git仓库 action。这里设计的初衷是用来打开toolswindows。简单使用
 * @author Shamee Loop
 */
public class GitRepositoryAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        NotificationUtils.notifyMessage("~~~~长时间久坐，休息一下吧~~~~", NotificationType.INFORMATION);
    }
}
