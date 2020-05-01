package JunitRun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class TestDemoJunit {

	@Test
	public void test() {
		AdditionTest a = new AdditionTest();
		int result = a.add(2, 3);
		Assert.assertEquals(53,result);
		
	}

}
