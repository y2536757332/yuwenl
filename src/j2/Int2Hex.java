package j2;
/**
 *	该脚本用于将十进制数转化为十六进制的字符串
 *	类中包含两个方法
 *	i2c转化数字为对应的十六进制字符
 *	i2h实现字符的拼接，实现脚本所需功能
 *	yuwenl
 *	2019/04/30
 */
public class Int2Hex {
	/**
	 * 该方法利用了辗转相除法的思想
	 * 在过程中把得到的数字转化为字符串
	 * 然后与之前的字符串拼接起来
	 * 最终得到一个顺序排序的十六进制字符串
	 * 即为返回的结果
	 * @param a
	 * @return
	 */
	public static String i2h(int a){
		int b;char[] c=new char[100];int i=0;String str="",st="0";
		    if(a==0){
			    return st;
			}
		    else{
			    while(a!=0){//此处使用辗转相除法完成进制转化
			    	b=a%16;
			    	c[i]=i2c(b);
			    	String lj=String.valueOf(c[i]);//将字符转化为字符串
			    	str=lj.concat(str);//然后拼接起来
			    	a=a/16;
			    	i++;
			    }
			    return str;
		    }
		}
	/**
	 * 这个方法实现将数字转化为字符
	 * 采用的是将数字转化为对应十六进制字母的ascii码值
	 * 然后强制转化为字符型
	 * @param a
	 * @return
	 */
	public static char i2c(int a){
		char num;int i;
		if(a<10){
			i=a+48;
			num=(char)i;
			}
		else{
			i=a+55;
			num=(char)i;
		}
		return num;
	}
	/**
	 * 主函数用于检验方法是否正确
	 * @param args
	 */
	public static void main(String []args){
		int a=43;
		String str=i2h(a);
		System.out.println(str);
	}
}
