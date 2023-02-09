package com.ruijie.shamee.gitcc.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;


/**
 * 创建git检查仓库tool windows视窗
 * @author Shamee Loop
 */
public class GitCCRepositoryWindowFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        GitCCRepositoryWindow window = new GitCCRepositoryWindow(toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(window.getContentPanel(), "", false);
        toolWindow.getContentManager().addContent(content);
    }

}
