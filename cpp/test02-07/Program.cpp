#include "Product.h"
#include <iostream>
#include <vector>
using namespace std;

int main() {
    // Product pt(1001, 10, 5);
    // cout<<pt.getCode()<<endl;

    int choice=-1;
    int code = 0;
    int price = 0;
    int stock = 0;
    Cart cart;

    do {
        cout<<"Select the choice \n 1. Enter the Product in Cart \n 2. Get the Cart total cart Price \n 3. Display Product Details \n 4. Display total Product \n 0. Exit "<<endl;
        cout<<"Enter the choice: "<<endl;
        cin>>choice;
        switch(choice) {
            case 1:
                cout<<"Create product to enter into the Cart "<<endl;
                cout<<"Enter the Code(id) of product"<<endl;
                cin >> code;
                cout<<"Enter the Price of Product"<<endl;
                cin >> price;
                cout<<"Enter the Stock of Product"<<endl;
                cin >> stock;
                {
                    Product pt(code, price, stock);
                    cart.addProduct(pt);
                }
                
                break;

            case 2: 
                cout<<"Total Price of the Cart is: "<< cart.totalCartPrice()<<endl;
                break;

            case 3:
                cout<<"Enter the Code(id) of product"<<endl;
                cin>>code;
                cart.displayProductDetails(code);
                break;

            case 4:
                cout<<"Displaying all the Products "<<endl;
                cart.displayAllProducts();
                break;

            case 0:
                cout<<"Exiting....."<<endl;
                break;
            
            default:
                cout<<"Enter the valid choice"<<endl;
                
        }

    } while(choice != 0);

}
