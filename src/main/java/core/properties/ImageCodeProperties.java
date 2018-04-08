/**
 * 
 */
package core.properties;

/**
 * @author zhailiang
 *
 */
public class ImageCodeProperties  {
	private int length = 6;
	private int expireIn = 60;
	private int width = 67;
	private int height = 23;
	private String url;
	
	public ImageCodeProperties() {
		setLength(4);
	}
	 
	
	public int getLength() {
		return length;
	}
	public void setLength(int lenght) {
		this.length = lenght;
	}
	public int getExpireIn() {
		return expireIn;
	}
	public void setExpireIn(int expireIn) {
		this.expireIn = expireIn;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
