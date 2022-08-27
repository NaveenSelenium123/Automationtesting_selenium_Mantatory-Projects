package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberSample {
	public static void Smple(String json) {
		
	
File f= new File("E:\\August19new eclipse\\CucumberReport\\target");
Configuration c =new Configuration(f,"cucumber_Aviation Project_26-08-2022---- 9AM");
c.addClassifications("sprint number","29");
c.addClassifications("operating system","windows");
c.addClassifications("windows","11");

c.addClassifications("browser name","chrome");
c.addClassifications("version no","100");
List <String> l =new ArrayList<>();
l.add(json);
ReportBuilder builder =new ReportBuilder(l,c);
builder.generateReports();
}
}