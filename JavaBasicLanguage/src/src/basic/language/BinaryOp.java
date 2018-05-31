package src.basic.language;
/**
 * 这个类主要讲了二进制操作，移位运算
 * >>> 向右移动，高位永远补零
 * >> 数位向右移动，高位1（负数）则补1，高位0（正数）则补0，保持符号位不变，其结果符合数学除法规律（自动向小方向取整）
 * 
 * 移位运算的用途：与掩码（mask）运算（&）配合将数据进行拆分
 * 
 * @author Think
 *
 */
public class BinaryOp {
	public static void main(String[] args) {
		int n = -36;
		int m = n >> 2;
		int k = n >>> 3;
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(k);
		
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		
		
		
	}
}
