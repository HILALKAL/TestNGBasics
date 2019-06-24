package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExp{
	
	@DataProvider
	public Object [][] setUpData(){
		Object [][] data=new Object [3][3];
	data [0][0]="Kemal";
	data [0][1]="Berk";
	data [0][2]=11;
	
	data [1][0]="Elif";
	data [1][1]="Zulal";
	data [1][2]=7;
	
	data [2][0]="Zeynep";
	data [2][1]="Meral";
	data [2][2]=4;
	
	return data;
	}
	
	@Test (dataProvider="setUpData")
	public void getData(String a,String b, int c) {
		System.out.println(a+c+b);
	}
	
	
	
}
