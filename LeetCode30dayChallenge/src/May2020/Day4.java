package May2020;

public class Day4 {
	/*
	 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Number complement of "+5+" is:"+findComplement(5));
	}
    public static int findComplement(int num) {
        int result =0 ;
        int power = 1;//2power0
        while(num!=0){
            result += (num%2 ^1)* power;//least bit towards right is determined whether odd or even by %2 and XOR with 1 bit to flip that bit and multiplied by 2power
            power <<=1;//changing the power to 2
            num   >>=1;//truncating the least bit that was flipped
        }
        return result;
    }

}
