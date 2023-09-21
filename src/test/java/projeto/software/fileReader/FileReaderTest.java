package projeto.software.fileReader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void shouldReturnFilePath() {
        FileReader.getInstance().setPath("src/main/resources");
        FileReader.getInstance().setFile("text.txt");
        assertEquals("src/main/resources/text.txt", FileReader.getInstance().getFilePath());
    }

    @Test
    void shouldReturnFileName() {
        FileReader.getInstance().setFile("text.txt");
        assertEquals("text.txt", FileReader.getInstance().getFileName());
    }
}