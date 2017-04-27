package local.spring.rest;

public class MyRestResponse {
  private final long id;
  private final String contents;

  public MyRestResponse(long id, String content){
    this.id = id;
    this.contents = content;
  }

  public long getId() {
    return id;
  }

  public String getContents() {
    return contents;
  }
}
