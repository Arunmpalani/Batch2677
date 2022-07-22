package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class sampletestextend extends BaseTest{
  @Test
  public void f() {
	  Reporter.log("Hello",true);
  }
}
