#include <iostream>
#include <string>
#include <fstream>
#include <cstdlib>
#include <locale.h>
#include <time.h>

using namespace std;

int main () {
	setlocale(LC_ALL, "Portuguese");
	
	//solicita pro usuario quantos numeros quer
	long long int qtdNumeros;
	cout << "Quantos números quer gerar?\nValor: ";
	cin >> qtdNumeros;
	
	//solicita pro usuario nome do arquivo de destino
	string nomeArquivo;
	cout << "Informe o nome do arquivo com a extensão.\nValor: ";
	cin >> nomeArquivo;
	
	//criar um arquivo para a escrita
	ofstream procuradorArquivo;
	procuradorArquivo.open(nomeArquivo.c_str());
	
	//popula no arquivo a qtd de numeros sorteados
	srand(time(NULL));
	int valor;
	
	for (; qtdNumeros > 0; qtdNumeros--) {
		valor = rand() % 100;
		procuradorArquivo << valor << "\n";
	}
	
	procuradorArquivo.close();
	cout << "Arquivo gerado com sucesso!";
	
	return 0;
}

