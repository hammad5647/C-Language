#include<iostream>
using namespace std;
class Shape
{
    private:
    char color[100];
    int area;
    
    public:
    int l,w,r;

    void setData()
    {
        cout<<"Enter the color :";
        cin>>color;

        cout<<"Enter the area :";
        cin>>area;
    }
    void getData()
    {
        cout<<color<<"\t"<<area<<endl;
    }
    virtual void calcarea()=0;
};
class Circle : public Shape
{
    public:

    void calcarea()
    {
        setData();
        getData();

        cout<<"Enter the radius :";
        cin>>r;
        cout<<"Area of circle is :"<<3.14*r*r<<endl;
    }
};
class Rectangle : public Shape
{
    public:
    
     void calcarea()
    {
        setData();
        getData();

        cout<<"Enter the length and width :";
        cin>>l>>w;

        cout<<"Area of Rectangle is :"<<l*w<<endl;
    }
};
int main()
{
    Circle c1;
    Rectangle r1;
    Shape *s1;

    s1=&c1;
    c1.calcarea();

    s1=&r1;
    r1.calcarea();

}