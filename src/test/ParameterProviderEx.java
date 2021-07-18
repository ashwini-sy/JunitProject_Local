package test;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterProviderEx implements ParameterResolver{

	@Override
	public Object resolveParameter(ParameterContext parametercontext, ExtensionContext arg1) throws ParameterResolutionException {
		// TODO Auto-generated method stub
		return new ChromeDriver();
	}
	@Override
	public boolean supportsParameter(ParameterContext parametercontext, ExtensionContext arg1) throws ParameterResolutionException {
		// TODO Auto-generated method stub
		
		return parametercontext.getParameter().getType()== ChromeDriver.class;

	}

}
