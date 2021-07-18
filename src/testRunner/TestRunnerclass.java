package testRunner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludePackages({"packA" , "packB"})
@IncludeTags("Sanity")
public class TestRunnerclass {
	
	
	
	
}
