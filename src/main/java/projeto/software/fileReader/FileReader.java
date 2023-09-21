package projeto.software.fileReader;

public class FileReader {
    private FileReader() {}
    private static FileReader instance = new FileReader();
    public static FileReader getInstance() {
        return instance;
    }

    private String path;
    private String fileName;

    public void setFile(String fileName) {
        this.fileName = fileName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilePath() {
        return path + "/" + fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
