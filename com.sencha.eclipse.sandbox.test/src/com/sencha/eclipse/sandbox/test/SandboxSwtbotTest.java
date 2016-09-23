/**
 *
 */
package com.sencha.eclipse.sandbox.test;

import com.sencha.eclipse.sandbox.swtbot.SwtBotTestingUtilities;

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

  public void testRunSomethingInUi() {
    // do something in ui
    SwtBotTestingUtilities.performAndWaitForWindowChange(bot, new Runnable() {
      @Override
      public void run() {
        bot.perspectiveById("org.eclipse.jdt.ui.JavaPerspective").activate();
      }
    });

    // if I got this far, then the linux headless x frame buffer is working
    assertTrue(true);
  }

}
