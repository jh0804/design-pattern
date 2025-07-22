package ex96.type1.lib;

public interface DB {
    void setUrl(String url);

    int execute(String sql);
}
