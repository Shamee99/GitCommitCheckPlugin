package com.ruijie.shamee.gitcc.window;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.intellij.openapi.wm.ToolWindow;
import com.ruijie.shamee.gitcc.datacenter.DataCenter;
import com.ruijie.shamee.gitcc.utils.FilesUtils;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


/**
 * GitCC视窗
 * @author Shamee Loop
 */
public class GitCCRepositoryWindow {

    private JTextField tfGitAccount;
    private JButton btnOk;
    private JButton btnClose;
    private JPasswordField pfGitPassword;
    private JTextField tfGitRepo1;
    private JTextField tfGitRepo2;
    private JTextField tfGitRepo3;
    private JTextField tfGitRepo4;
    private JTextField tfGitRepo5;
    private JPanel contentPanel;


    public JPanel getContentPanel() {
        return contentPanel;
    }

    public GitCCRepositoryWindow(ToolWindow toolWindow) {
        btnOk.addActionListener(e -> {
            DataCenter dataCenter = new DataCenter(
                    tfGitAccount.getText(),
                    pfGitPassword.getText(),
                    tfGitRepo1.getText(),
                    tfGitRepo2.getText(),
                    tfGitRepo3.getText(),
                    tfGitRepo4.getText(),
                    tfGitRepo5.getText());
            FileUtil.writeString(String.valueOf(JSONUtil.parse(dataCenter)), FilesUtils.getDataCenterJsonFile(), StandardCharsets.UTF_8);
        });

        // 关闭
        btnClose.addActionListener(e -> toolWindow.hide());
    }




}
