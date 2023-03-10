/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void appFinds() throws Exception{
        assertEquals("resources/dir3/file2", App.searchFile("file2", "resources"));
    }
    @Test void appCreatesDir() throws IOException{
        String dirPath = "resources/tempDir";
        App.createDir(dirPath);
		Path dir = Paths.get(dirPath);
        assertTrue(Files.exists(dir) && Files.isDirectory(dir));
        Files.delete(dir);
    }
    @Test void lists() throws IOException{
        
    }
}
