# obcy
我的第一个库


#include<iostream.h>
class Clock{
public:
	void setTime(int H=0,int M=0,int S=0);
	void showTime();
private:
	int hour,minute,second;
};

void Clock::setTime(int H,int M,int S){          //类的成员函数的定义
hour=H;minute=M;second=S;                       //形式 ： （函数类型 类名::成员函数名(参数)）
}

inline void Clock::showTime(){                   //inline是把函数定义成内联函数，
cout<<hour<<":"<<minute<<":"<<second<<endl;    //（类的内联函数，函数的代码被放入符号表中，在使用时直接进行替换，
}                                             //(像宏一样展开)，没有了调用的开销，效率也很高。


int main()
{
Clock a1;                                     //定义对象a1
cout<<"设置时间默认值"<<endl;
a1.setTime();								//a1调用类的成员函数
a1.showTime();
cout<<"设置新的时间"<<endl;
a1.setTime(8,30,30);
a1.showTime();
return 0;

}
