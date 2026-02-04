#include<iostream>
using namespace std;
void great(){
    cout<<"hellow"<<endl;
}
void namegreat(string name){
    cout<<"hellow"<<name<<endl;
}
int clalc(){
    return 1;
}
int add(int a,int b){
    return a+b;
}
int main(){
    great();
    namegreat(" hemash");
    int c= clalc();
    int d=add(4,5);
    cout<<c<<endl<<d<<endl;
}
