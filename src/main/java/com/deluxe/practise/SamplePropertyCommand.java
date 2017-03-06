package com.deluxe.practise;

import com.deluxe.utils.AutoConstants;
import com.deluxe.utils.PropHandlerz;

public class SamplePropertyCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty(AutoConstants.ProjectDir.ProjDir)+"\\OR.properties");
		System.out.println(PropHandlerz.fetchProp(AutoConstants.URL.URL));

	}

}
