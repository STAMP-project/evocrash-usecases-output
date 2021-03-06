/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 05 14:37:00 GMT 2019
 */

package org.objectweb.proactive.extensions.dataspaces.vfs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI;
import org.objectweb.proactive.extensions.dataspaces.core.SpaceInstanceInfo;
import org.objectweb.proactive.extensions.dataspaces.core.naming.SpacesDirectory;
import org.objectweb.proactive.extensions.dataspaces.exceptions.SpaceNotFoundException;
import org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VFSSpacesMountManagerImpl_ESTest extends VFSSpacesMountManagerImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpacesDirectory spacesDirectory0 = mock(SpacesDirectory.class, new ViolatedAssumptionAnswer());
      doReturn((SpaceInstanceInfo) null).when(spacesDirectory0).lookupOne(any(org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI.class));
      VFSSpacesMountManagerImpl vFSSpacesMountManagerImpl0 = new VFSSpacesMountManagerImpl(spacesDirectory0);
      DataSpacesURI dataSpacesURI0 = DataSpacesURI.createScratchSpaceURI("<tr><td bgcolor=\"#993300\" style=\"color:White; font-size : xx-small;\" colspan=\"6\">", "<tr><td bgcolor=\"#993300\" style=\"color:White; font-size : xx-small;\" colspan=\"6\">", "Resolved space is not suitable for user path: ", "Unknown periodicity type.", "Requested URI ");
      try { 
        vFSSpacesMountManagerImpl0.resolveFile(dataSpacesURI0, "Requested URI ");
        fail("Expecting exception: SpaceNotFoundException");
      
      } catch(SpaceNotFoundException e) {
         //
         // Requested data space is not registered in spaces directory.
         //
         verifyException("org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl", e);
      }
  }
}
