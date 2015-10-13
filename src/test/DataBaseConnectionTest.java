package test;

import org.junit.Test;

import com.zz.dbc.DataBaseConnection;

public class DataBaseConnectionTest {

	@Test
	public void test() {
		DataBaseConnection dataBaseConnection = new DataBaseConnection();
		dataBaseConnection.connect();
	}

}
