package calculo;

public class calculo2 {
private double a;
private double b;
private double c;
private double d;
private double e;
private double f;

public calculo2(double a,double b,double e,double c,double d,double f) {
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
	this.e=e;
	this.f=f;
}
public double geta() {
	return this.a;
}
public double getb() {
	return this.b;
}
public double getc() {
	return this.c;
}
public double getd() {
	return this.d;
}
public double gete() {
	return this.e;
}
public double getf() {
	return this.f;
}
public boolean devuelboolean() {
	boolean p=true;
	double deno;
	deno=a*d -b*c;
	if(deno==0) {
		p=false;
	}
	return true;
}
public double getx() {
	double resul;
	resul= (e*d-b*f)/(a*d-b*c);
	return resul;
}
public double gety() {
	double resul;
	resul= (a*f-e*c)/(a*d-b*c);
	return resul;
}
}
