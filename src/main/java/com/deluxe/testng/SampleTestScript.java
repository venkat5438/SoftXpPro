package com.deluxe.testng;

import org.testng.annotations.Test;

import com.delux.common.BaseClass;
import com.deluxe.utils.AutoConstants;
import com.deluxe.utils.PropHandlerz;

public class SampleTestScript extends BaseClass {
  @Test(groups="REG")
  public void openURL() {
	  driver.get(PropHandlerz.fetchProp(AutoConstants.URL.URL));
  }
}
