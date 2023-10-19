package model;

public interface Associado {

	double lucros(int qdeCotas, double valorCota);
	
	int getqdeCotas();
	void setqdeCotas(int qdeCotas);
	double getvalorCota(double valorCota);
	void setvalorCota(double valorCota);
}
