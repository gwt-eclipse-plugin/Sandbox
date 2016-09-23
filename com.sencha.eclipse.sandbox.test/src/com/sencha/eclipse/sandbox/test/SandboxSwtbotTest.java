/**
 *
 */
package com.sencha.eclipse.sandbox.test;

import com.sencha.eclipse.sandbox.swtbot.SwtBotTestingUtilities;

import junit.framework.TestCase;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.SWTBot;

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

  public void testRunSomethingInUi() {
    waitForIdle(bot);

    //closeWelcome(bot);

    // if I got this far, then the linux headless x frame buffer is working
    assertTrue(true);
  }

  public static void closeWelcome(SWTWorkbenchBot bot) {
    SWTBotView activeView = bot.activeView();
    if (activeView != null && activeView.getTitle().equals("Welcome")) {
      activeView.close();
    }
  }

  /**
   * Wait until all background tasks are complete.
   */
  public static void waitForIdle(SWTBot bot) {
    while (!Job.getJobManager().isIdle()) {
      bot.sleep(1000);
    }
  }

}
