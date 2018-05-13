package pl.dmcs.demos;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

public class DemoStubMethodCallsTest {
	
	@Test
	void testStubMethodCalls() {
		@SuppressWarnings("unchecked")
		LinkedList<String> mockedList = mock(LinkedList.class);
		
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenReturn("second");
		when(mockedList.size()).thenReturn(2);
		when(mockedList.get(2)).thenThrow(new RuntimeException());
		
		System.out.println(mockedList.get(0));
		System.out.println(mockedList.get(1));
		System.out.println(mockedList.size());

		//System.out.println(mockedList.get(2)); //exception
	}

}
