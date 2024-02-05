#include<iostream>
using namespace std;
class RBI
{
    public:
    virtual void loan()=0;
};
class BOB:public RBI
{
    public:
    void loan ()
    {
        cout<<"Interest On loan Of BOB is 7%"<<endl;
    }
};
class SBI : public RBI
{
    public:
    void loan()
    {
        cout<<"Interest On loan of SBI is 7.5%";
    }
};
int main()
{
    RBI *r1;
	BOB b1;
	
	r1 = &b1;
	r1->loan();
	
	SBI s1;
	r1 = &s1;
	r1->loan();
}