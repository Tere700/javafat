package tw.org.iii.teresaaaaaaapp;

import tw.org.iii.classes.CTest1;//所有類別都一定有建構式跟父類別 除了Object
import tw.org.iii.classes.CTest2;//找父類別的無傳參數來幫忙 有傳參數會找不到
					//除了自己要初始化外 祖宗八代要全部的方法都叫進來
public class CT1 {

	public static void main(String[] args) {
		CTest1 obj1 = new CTest1(1);
		CTest1 obj2 = new CTest2();

	}

}
