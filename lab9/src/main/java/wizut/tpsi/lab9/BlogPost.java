package wizut.tpsi.lab9;





public class BlogPost  {

	private long id;
	private String title ;
	private String content ;

	public BlogPost() {
		
	}

   public BlogPost(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
	
}