#include<iostream>
using namespace std;

void numericHalfPyramid(int n)
{
    for(int i=0; i<n; ++i){
        for(int j=0; j<i+1; ++j){
            cout<<j+1<<" ";
        }
        cout<<endl;
    }
}

void invertedNumericHalfPyramid(int n){
    for(int i=0; i<n; ++i){
        for(int j=0; j<n-i; ++j){
            cout<<j+1<<" ";
        }
        cout<<endl;
    }
}

int main(){
    int n;
    cout<<"Enter the value of n: ";
    cin>>n;
    cout<<endl;
    numericHalfPyramid(n);
    invertedNumericHalfPyramid(n);
}