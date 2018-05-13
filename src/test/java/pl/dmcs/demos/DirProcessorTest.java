package pl.dmcs.demos;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;
import org.junit.jupiter.api.Test;

public class DirProcessorTest {
	
	private String TEST_DIR = "C:\\Users\\Jacek\\Desktop\\Dokumenty\\Tapety\\";
	private String JPG = "jpg";
	
	@Test
	void testEnhanceJPGImages() {
		ImageProcessor processor = mock(ImageProcessor.class);
		DirProcessor dirProcessor = new DirProcessor(processor);
		
		dirProcessor.enhanceImage(TEST_DIR, JPG);
		
		verify(processor).enhanceImage(TEST_DIR + "1.jpg");
		verify(processor).enhanceImage(TEST_DIR + "2.jpg");
		
		verify(processor, never()).enhanceImage(TEST_DIR + "photo1.jpg");
		
	}

}
