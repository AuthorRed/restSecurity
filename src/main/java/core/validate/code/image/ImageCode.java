/**
 * 
 */
package core.validate.code.image;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;



/**
 * @author zhailiang
 *
 */
public class ImageCode {
	
	private BufferedImage image; 
	private String code;
	
	private LocalDateTime expireTime;
	
	public ImageCode(BufferedImage image,String code, int expireIn){
		this.image=image;
		this.code = code;
		this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
	}
	
	public ImageCode(BufferedImage image,String code, LocalDateTime expireTime){
		this.image=image;
		this.code = code;
		this.expireTime = expireTime;
	}
	

	public boolean isExpried() {
		return LocalDateTime.now().isAfter(expireTime);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}
	
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

}
