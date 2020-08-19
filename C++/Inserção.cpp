#include <iostream>
#include <vector>
#include <cstdlib>
#include <locale.h>
#include <time.h>

using namespace std;

vector<int> populaVetor(long long int TAM) {
	long long int i;
	vector<int> vetor;
	
	srand(time(NULL));
	for (i = 0; i < TAM; i++) {
		vetor.push_back(rand() % 1000); 
	}
	return vetor;
}

void ordenaSelecao(vector<int> &vetor) {
	long long int i, j, posMenor;
	int aux, qtdComparacoes = 0, qtdTrocas = 0;

	for (i = 0; i < vetor.size() -1; i++) {
		posMenor = i;
		for (j = i + 1; j < vetor.size(); j++) {
			qtdComparacoes++;
			if (vetor[j] < vetor[posMenor]) posMenor = j;
		}
		if (i != posMenor) {
			aux = vetor[i];
			vetor[i] = vetor[posMenor];
			vetor[posMenor] = aux;
			qtdTrocas++;
		}
	}
	cout << "\nInserção utilizando o vector (Seleção):\nQuantidade de comparações: " << qtdComparacoes << "\nQuantidade de trocas: " << qtdTrocas;
}

void ordenaInsercao(vector<int> &vetor) { //Utilizando o vector
	long long int i, j;
	int aux, qtdComparacoes = 0, qtdTrocas = 0;

	for (i = 1; i < vetor.size(); i++) {
		aux = vetor[i];
		qtdComparacoes++;

		for (j = i-1; j >= 0; j--) {
			if (aux < vetor[j]) { //Shift	
				vetor[j+1] = vetor[j];
				qtdComparacoes++;
				qtdTrocas++;
			}
		}
		vetor[j+1] = aux;
		qtdTrocas++;
	}
	cout << "\n\nInserção utilizando o vector (Inserção):\nQuantidade de comparações: " << qtdComparacoes << "\nQuantidade de trocas: " << qtdTrocas;
}

/*/
CelulaD *insercao(CelulaD *lista) { //Utilizando lista duplamente encadeada
	CelulaD *i, *j;
	int aux, qtdComparacoes = 0, qtdTrocas = 0;
	
	if (!lista) return lista;
	for (; lista->ant; lista = lista->ant);
	
	for (i = lista->prox; i; i = i->prox) {
		aux = i->dado;
		qtdComparacoes++;
		
		for (j = i->ant; j; j = j->ant) {
			if (aux < j->dado) {
				j->prox->dado = j->dado;
				qtdComparacoes++;
				qtdTrocas++;
			}
		}
		if (!j) {
			lista->dado = aux;
		} else j->prox->dado = aux;
		qtdTrocas++;
	}
	cout << "\n\nInserção utilizando lista duplamente encadeada:\nQuantidade de comparações: " << qtdComparacoes << "\nQuantidade de trocas: " << qtdTrocas;
	return lista;
}
/*/

void exibir(vector<int> &vetor) { //Utilizando o vector
	long long int i;
	
	for (i = 0; i < vetor.size(); i++) {
		cout << vetor[i] << endl;
	}
	
}

int main () {
	setlocale(LC_ALL, "Portuguese");
	
	long long int TAM;
	
	cout << "Insira a quantidade números a serem gerados\nValor: ";
	cin >> TAM;
	
    vector<int> vetorSelecao = populaVetor(TAM);
	vector<int> vetorInsercao = populaVetor(TAM);
	//exibir(vetorSelecao);
	//cout << " outro....." << endl;
	//exibir(vetorInsercao);

	ordenaSelecao(vetorSelecao);
	ordenaInsercao(vetorInsercao);

	return 0;
}
