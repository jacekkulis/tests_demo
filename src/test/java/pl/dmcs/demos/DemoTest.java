package pl.dmcs.demos;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DemoTest {
	
	@Test
	void testInteractions() {
		@SuppressWarnings("unchecked")
		List<String> mockedList = mock(List.class);
		
		mockedList.add("oneString");
		mockedList.add("secondString");
		mockedList.clear();
		
		verify(mockedList).add("oneString");
		verify(mockedList).add("secondString");
		verify(mockedList).clear();
	
	}
	
	@Test
	void testInteractions2() {
		@SuppressWarnings("unchecked")
		List<String> mockedList = mock(List.class);
			
		mockedList.add("oneString");
		mockedList.add("secondString");
		
		System.out.println(mockedList.get(0)); //null
		System.out.println(mockedList.get(1)); //null
		System.out.println(mockedList.size()); //0
		
		mockedList.clear();
		
		System.out.println(mockedList.size()); //0
		
		verify(mockedList).add("oneString");
		verify(mockedList).add("secondString");
		verify(mockedList).clear();
		
	}

}
