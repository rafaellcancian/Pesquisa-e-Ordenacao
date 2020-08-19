#include <iostream>
#include <string>
#include <fstream>
#include <sstream>
#include <locale.h>

using namespace std;

long long int contarNumeros(string nomeArquivo) {
	ifstream arquivo;
	arquivo.open(nomeArquivo.c_str());
	
	if (!arquivo) {
    	cerr << "ERRO: Não foi possível abrir o arquivo.";
    	system ("CLS");
    	exit(1);
	}
	
	string linha;
	int num;
	long long int contador=0;
	
	while (!arquivo.eof()) {
	    getline(arquivo,linha);
	    
	    istringstream iss(linha);
	    iss >> num;
	    
	    if (iss != 0) {
	    	contador++;
		}
    }  
    arquivo.close();
	return contador;
}

void armazenarNumeros(string nomeArquivo, long long int TAM) {	
	ifstream arquivo;
	arquivo.open(nomeArquivo.c_str());
	
	if (!arquivo) {
    	cerr << "ERRO: Não foi possível abrir o arquivo.";
    	system ("CLS");
    	exit(1);
	}
	
	string linha;
	int* numerosArmazenados = new int[TAM];
	int num;
	long long int i=0;
	
	while (!arquivo.eof()) {
	    getline(arquivo,linha);
	    
	    istringstream iss(linha);
	    iss >> num;
	    
	    if (iss != 0) {
	    	numerosArmazenados[i] = num;
	    	i++;
		}
    }  
    arquivo.close();
}

int main () {
	setlocale(LC_ALL, "Portuguese");
	
	string nomeArquivo;
	cout << "Informe o nome do arquivo com a extensão.\nValor: ";
	cin >> nomeArquivo;
	
	long long int TAM = contarNumeros(nomeArquivo);
	armazenarNumeros(nomeArquivo,TAM);
	
	cout << "\nForam armazenados " << TAM << " números com sucesso!";
	
	return 0;
}
