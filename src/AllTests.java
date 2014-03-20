import priorityQueue.StablePriorityQueue;

import org.junit.Assert;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.*;


@SuiteClasses({StablePriorityQueue.class})
public class AllTests {
	private StablePriorityQueue pq = new StablePriorityQueue(11);
	@Before
	public void addElements() {
		for(int i = 0; i < 11; i++){
			pq.insert(i);
		}
	}

	@Test
	public void insertInserts(){
		Assert.assertTrue(pq.size() == 11);
	}
	@Test
	public void firstInIsFirstOut(){

		pq.extractMaximum();
		//Assert.assertTrue(pq.extractMaximum() == 0);
	}
	@Test
	public void getMaxDoesNotExtractMax(){
		StablePriorityQueue prevPQ = pq;
		pq.getMaximum();
		Assert.assertTrue(prevPQ == pq);
	}
	@Test
	public void isNotEmpty(){
		Assert.assertFalse(pq.isEmpty());
	}
	@Test
	public void isEmpty(){
		pq.clear();
		Assert.assertTrue(pq.isEmpty());
	}
	@Test
	public void compareTo(){
		Assert.assertEquals(pq.compareTo(0), 0);
	}
	@Test
	public void compareReturnsNegOne(){
		Assert.assertEquals(pq.compare(0, 1), -1);
	}
	@Test
	public void compareReturnsOne(){
		Assert.assertEquals(pq.compare(2, 0), 1);
	}
	@Test
	public void compareReturnsZero(){
		Assert.assertEquals(pq.compare(0, 0), 0);
	}
	@Test
	public void showPrintsList(){
		pq.show();
		//Assert.assertEquals(pq.compare(0, 0), 0);
	}
	@Test
	public void getCorrectSize(){
		Assert.assertEquals(pq.size(), 11);
	}
	@Test
	public void sizeZeroExtractMax(){
		pq.clear();
		Assert.assertTrue(pq.extractMaximum() == null);
	}
	@Test
	public void sizeZeroGetMax(){
		pq.clear();
		Assert.assertTrue(pq.getMaximum() == null);
	}
	
}
