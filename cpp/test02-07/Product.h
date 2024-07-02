#include<iostream>
#include<vector>
using namespace std;

class Product 
{
    private :
        int code;
        int price;
        int stock;

    public :

        Product() 
        {
            code = 100;
            price = 0;
            stock = 0;
        }

        Product(int id, int pr, int st)
        {
            code = id;
            price = pr;
            stock = st;
        }

        virtual void ToString() 
        {
            cout<< "Code of product is: "<<code<<endl;
            cout<< "Price of product is: "<<price<<endl;
            cout<< "stock of product is: "<<stock<<endl;
        }

        int getPrice() {
            return price;
        }

        int getCode() {
            return code;
        }

        int getStock() {
            return stock;
        }
};

class Cart
{
    private:
        vector<Product> prod;
        int cartPrice;

    public:

        Cart() {
            cartPrice = 0;
        }

        Cart(Product pr) {
            prod.push_back(pr);
            cartPrice += pr.getPrice();
        }
        
        void addProduct(Product pr) {
            prod.push_back(pr);
            cartPrice += pr.getPrice();
        }

        void removeProduct(Product pr) {
            if(pr.getCode() == prod[prod.size()-1].getCode()){
                prod.pop_back();
            }
            for(int i=0; i< prod.size(); ++i) {
                if(pr.getCode() == prod[i].getCode()){
                    prod.erase(prod.begin()+i);
                }
            }
        }

        int totalCartPrice() {
            return cartPrice;
        }

        void displayProductDetails(int id) {
            for(int i=0; i< prod.size(); ++i) {
                if(prod[i].getCode() == id) {
                    cout << "Product Code: " << prod[i].getCode() << endl;
                    cout << "Product Name: " << prod[i].getPrice() << endl;
                    cout << "Product Price: " << prod[i].getStock() << endl;
                }
            }
        }

        void displayAllProducts() {
            for(int i=0; i<prod.size(); ++i) {
                cout << "Product Code: " << prod[i].getCode() << endl;
                cout << "Product Name: " << prod[i].getPrice() << endl;
                cout << "Product Price: " << prod[i].getStock() << endl;
            }
        }
       
};




