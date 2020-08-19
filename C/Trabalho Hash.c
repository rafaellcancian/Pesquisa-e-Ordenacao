#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

#define TAM 10

typedef struct {
	int idade;
	char nome[100];
} Aluno;

typedef struct no {
	Aluno aluno;
	struct no *prox;
} Celula;

Celula *inserir(Aluno a, Celula *l);
void pesquisar(Aluno a, Celula *l);
Aluno getPosicao(Celula *l, int posicao);
Celula *excluir(Aluno a, Celula *l);
int exibeConta(Aluno a, Celula *l);
void inicializarTabelaHash(Celula *tabela[], int n);
void checaColisao(Celula *l);
int hash(Aluno a);

Celula *inserir(Aluno a, Celula *l) {
	Celula *novo;
	Celula *p, *pR;

	novo = (Celula *)malloc(sizeof(Celula));
	novo->aluno = a;
	novo->prox = NULL;

	if (!l) return novo;

	for (pR = NULL, p = l; p; pR = p, p = p->prox) {
		if (a.idade < p->aluno.idade) break;
	}
	if (!pR) {
		novo->prox = p;
		return novo;
	}
	if (!p) {
		pR->prox = novo;
		return l;
	}

	pR->prox = novo;
	novo->prox = p;

	return l;
}

void pesquisar(Aluno a, Celula *l) {
	if (!l) {
		system("cls"); 
		printf("ERRO: Não foram encontrados alunos com a idade informada.\n\n");
		return;
	}

	Celula *p;
	Aluno aux;
	int posicao;

	posicao = exibeConta(a, l);
	aux = getPosicao(l, posicao);

	system("cls");
	printf("Nome: %s", aux.nome);
	printf("\nIdade: %d\n\n", aux.idade);
}

Aluno getPosicao(Celula *l, int posicao) {
	if (!l) {
		system("cls"); 
		printf("ERRO: Não foram encontrados alunos com a idade informada.\n\n");
		return;
	}
	
	Celula *p;
	int count = 0;

	for(p = l; p; p = p->prox) {	
		if (count == posicao) {
			return p->aluno;
		}
		count++;
	}
}

Celula *excluir(Aluno a, Celula *l) {
	Celula *p,*pR;
	int count, posicao;
	
	if (!l) {
		system("cls"); 
		printf("ERRO: Não foram encontrados alunos com a idade informada.\n\n");
		return;
	}

	posicao = exibeConta(a, l);

	system("cls");
	printf("Aluno excluído com sucesso.\n\n");
	
	for (count = 0, pR = NULL, p = l; p; pR = p, p = p->prox) {
		if (count == posicao) {
			break;
		}
		count++;
	}
	
	if (!p) return l;
	
	if (p == l) {
		l = l->prox;
		free(p);
		return l;
	}
	
	if (!p->prox) {
		free(p);
		pR->prox = NULL;
		return l;
	}
	
	pR->prox = p->prox;
	free(p);
	
	return l;
}

int exibeConta(Aluno a, Celula *l) {
	Celula *p;
	int count = 0, posicao;

	printf("\nResultado:\n");

	for(p = l; p; p = p->prox) {	
		if (strcmp(a.nome, p->aluno.nome) == 0) {
			printf("%d - %s\n", count, p->aluno.nome);
			count++;
		}
	}

	do {
		printf("\nSelecione um índice:\nÍndice: ");
		scanf("%d", &posicao);
	} while (count <= posicao);

	return posicao;
}

void inicializarTabelaHash(Celula *tabela[], int n) {
	int i;
	for (i = 0; i < n; i++) {
		tabela[i] = NULL;
	}
}

void checaColisao(Celula *l) {
	Celula *p;
	int count = 0;

	for(p = l; p; p = p->prox) {	
		count++;
	}
	if ((count != 0) && (count != 1)) {
		printf("Foram encontradas %d colisões.\n\n", count);
	} else {
		printf("Nenhuma colisão foi encontrada.\n\n");
	}
}

int hash(Aluno a) {
	int tamanho, ascInicio, ascFim;
	
	tamanho = strlen(a.nome);
	
	ascInicio = (int) a.nome[0];
	ascFim = (int) a.nome[tamanho - 1];

	return ((ascInicio + ascFim) % TAM);
}

int main() {
	setlocale(LC_ALL, "Portuguese");
	
	Aluno a;
	Celula *tabelaHash[TAM];
	int opcao, endereco;

	inicializarTabelaHash(tabelaHash, TAM);
	
	do {
		printf("Selecione uma opção abaixo:\n\n1 - Inserir\n2 - Pesquisar\n3 - Remover\n4 - Sair\n\nOpção: ");
		scanf("%d", &opcao);
		
		switch (opcao) {
			case 1: {
				system("cls");
				//receber dados do usuário: idade e nome
				printf("Digite o seu nome: ");
				scanf("%s", a.nome);
				printf("Digite a sua idade: ");
				scanf("%d", &a.idade);

				//executar a função hash para saber o endereço na tabelaHash
				endereco = hash(a);
				system("cls");
				printf("Foi gerado o endereço: %d\n\n", endereco);

				//inserir na tabelaHash
				tabelaHash[endereco] = inserir(a, tabelaHash[endereco]);
				checaColisao(tabelaHash[endereco]);
				break;
			}
			case 2: {   
				system("cls");          
				printf("Digite o nome para ser pesquisado: ");
				scanf("%s", a.nome);
				
				endereco = hash(a);

				pesquisar(a, tabelaHash[endereco]);
				break;
			}
			case 3: {
				system("cls");          
				printf("Digite o nome para ser excluído: ");
				scanf("%s", a.nome);

				endereco = hash(a);

				tabelaHash[endereco] = excluir(a, tabelaHash[endereco]);
				break;
			}
			case 4: {
				exit(0); 
				break;
			}
			default: {
				system("cls");
				printf("ERRO: Opção inválida.\n\n");
				break;
			} 
		}
	} while (opcao != 4);
	
	return 0;
}
