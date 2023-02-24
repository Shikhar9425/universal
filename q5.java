#include<iostream>
using namespace std;
class test{
	public:
	test(){
		cout<<"name of class is maths"<<endl;
	}
	test(string x){
		cout<<"this is"<<x<<endl;
		
	}	
	void show(){
		cout<<"this is defind"<<endl;
	}
};
int main (){
	test a1,a2("not defind value");
	a1.show();
	a2.show();
}