package com.javase.re;
/**
 * 图片重命名案例
 * 
 * @author Think
 *
 */
public class RenamePic {
	public static void main(String[] args) {
		String imgName = "1.jpg";
		imgName = imgName.replaceAll(
				".+\\.", 
				System.currentTimeMillis() + "."
				);
		System.out.println(imgName);
	}

}
