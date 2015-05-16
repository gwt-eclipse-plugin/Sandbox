/**
 *
 */
package com.sencha.eclipse.sandbox.test;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.internal.ui.wizards.buildpaths.BuildPathsBlock;

public class SandboxTest extends TestCase {

  public void testProjectCreation() throws CoreException {
    IProject project = createProject("Sandboxy");

    assertNotNull(project);
  }

  private static IProject createProject(String projectName) throws CoreException {
    IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
    IProject project = workspaceRoot.getProject(projectName);
    if (project.exists()) {
      throw new IllegalStateException("Project " + projectName
          + " already exists in this workspace");
    }

    IProgressMonitor monitor = new NullProgressMonitor();
    BuildPathsBlock.createProject(project, project.getLocationURI(), monitor);

    return project;
  }

}
