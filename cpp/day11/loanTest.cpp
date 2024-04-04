#include "loan.h"
#include<iostream>
using namespace std;

double testData[22][2]={{132000, 21},
					{122900, 12},
					{654321, 13},
					{1200000, 8},
					{1900000, 18},
					{800000, 5},
					{2500000, 20},
					{900000, 10},
					{1600000, 15},
					{700000, 6},
					{2200000, 22},
					{1300000, 12},
					{2100000, 17},
					{600000, 4},
					{1400000, 14},
					{1800000, 11},
					{2400000, 23},
					{1100000, 7},
					{1700000, 19},
					{1000000, 9},
					{2300000, 16},
					{1500000, 21}
					};



double GetTotalEMI(Loan* l,int n){

    double total_emis=0.0;
    for(int i=0;i<n;i++){
        total_emis += l[i].getEMI();
    }
    return total_emis;
}

double GetTotalPrinciple(Loan* l,int n){

    double total_princi=0.0;
    for(int i=0;i<n;i++){
        total_princi += l[i].getPrinciple();
    }
    return total_princi;

}

void Banking_System(Loan* L,int n){

    //Inserting the values in the objects
    for(int i=0;i<n;i++){
        
        L[i].setPrinciple(testData[i][0]);
        L[i].setPeriod(testData[i][1]);

        cout<<"Amount for: Object<"<<i<<"> is: "<<L[i].getPrinciple()<<" \t for time period:\t "<<L[i].getPeriod();
        cout<<"\tEMI:\t"<<L[i].getEMI()<<endl;
    }
    //Calculating the total EMI from of the objects
    double total_emis=GetTotalEMI(L,n);
    double total_princi = GetTotalPrinciple(L,n);

    cout<<"\n**************TOTAL EMI****************"<<endl;
    cout<<total_emis<<endl;

    cout<<"**************TOTAL Principal Amount****************"<<endl;
    cout<<total_princi<<endl;

}

int main(void){
    int n=10;
    int loantype;
    Loan *PL = new PersonalLoan[n];
    Loan *HL = new HomeLoan[n];

    

    here:
    cout<<"Enter your Loan type: \nType 1 : for Personal Loan\nType 2 : for Home Loan\n:>>";
    cin>>loantype;
    switch (loantype)
    {
        case 1:
            Banking_System(PL,n);
            break;
        case 2:
            Banking_System(HL,n);
            break;
        default:
            cout<<"\n!!!!!>>>>>Enter a valid option<<<<<!!!!!\n";
            goto here;
    }
}




