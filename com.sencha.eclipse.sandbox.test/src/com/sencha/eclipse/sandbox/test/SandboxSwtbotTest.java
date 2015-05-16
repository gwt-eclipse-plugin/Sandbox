/**
 *
 */
package com.sencha.eclipse.sandbox.test;

import com.google.gdt.eclipse.swtbot.SwtBotProjectActions;
import com.google.gdt.eclipse.swtbot.SwtBotTestingUtilities;
import com.google.gdt.eclipse.swtbot.SwtBotWorkbenchActions;

import junit.framework.TestCase;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

/**
 * https://wiki.eclipse.org/SWTBot/UsersGuide
 */
public class SandboxSwtbotTest extends TestCase {

  private SWTWorkbenchBot bot;

  @Override
  protected void setUp() throws Exception {
    bot = new SWTWorkbenchBot();
    SwtBotTestingUtilities.setUp(bot);
  }

  @Override
  protected void tearDown() throws Exception {
    SwtBotTestingUtilities.tearDown();
  }

  public void testSwtBotCreateProject() {
    SwtBotWorkbenchActions.waitForMainShellProgressBarToFinish(bot);

    SwtBotProjectActions.createJavaProject(bot, "SandboxySwty");
  }

}
