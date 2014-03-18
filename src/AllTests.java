import priorityQueue.StablePriorityQueue;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.*;


@SuiteClasses({StablePriorityQueue.class})
public class AllTests {
	private StablePriorityQueue pq = new StablePriorityQueue(11);

	@Test
	public void insert(){
		for(int i = 0; i < 11; i++){
			pq.insert(i);
		}
		Assert.assertTrue(pq.size() == 11);
	}
	@Test
	public void insertOverMax() throws Exception{
		for(int i = 0; i < 12; i++){
			pq.insert(i);
		}
	}

}
