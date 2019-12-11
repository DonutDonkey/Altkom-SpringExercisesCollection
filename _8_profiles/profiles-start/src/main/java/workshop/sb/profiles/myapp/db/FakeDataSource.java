package workshop.sb.profiles.myapp.db;

public class FakeDataSource {
    private String url;
    public  String getUrl() { return url; }

    private int port;
    public  int getPort() { return port; }

    public FakeDataSource(String url, int port) {
        this.url = url;
        this.port = port;
    }
}
