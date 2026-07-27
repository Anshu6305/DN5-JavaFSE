package com.cognizant.mockito.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FileServiceTest {

    @Test
    public void testServiceWithMockFileIO() {

        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        when(mockFileReader.read())
                .thenReturn("Mock File Content - Anshuman Routray (23052783)");

        FileService fileService = new FileService(mockFileReader, mockFileWriter);

        String result = fileService.processFile();

        verify(mockFileWriter).write("Mock File Content - Anshuman Routray (23052783)");

        assertEquals(
                "Processed Mock File Content - Anshuman Routray (23052783)",
                result
        );

    }

}