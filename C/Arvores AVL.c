#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <locale.h>

#define count 10

typedef struct no {
	int dado;
	int fb;
	struct no *esq, *dir;
} Arvore;

int altura(Arvore *r);
Arvore* rodarEsq(Arvore *r);
Arvore* rodarDir(Arvore *r);
Arvore *inserir(int valor, Arvore *r);
void exibir(Arvore *r, int espaco);
void atualizarFB(Arvore *r);

int altura(Arvore *r) {
	if (r) {
		int alturaEsq = altura(r->esq);
		int alturaDir = altura(r->dir);
		if (alturaEsq > alturaDir) {
			return alturaEsq + 1;
		} else {
			return alturaDir + 1;
		}
	} else {
		return 0;
	}
}

Arvore* rodarEsq(Arvore *r) {
	Arvore *tmp, *novoPai;

	novoPai = r->dir;
	tmp = novoPai->esq;
	novoPai->esq = r;
	r->dir = tmp;
	return novoPai;
}

Arvore* rodarDir(Arvore *r) {
	Arvore *tmp, *novoPai;

	novoPai = r->esq;
	tmp = novoPai->dir;
	novoPai->dir = r;
	r->esq = tmp;
	return novoPai;
}

Arvore *inserir(int valor, Arvore *r) {
	if (r) {
		if (valor < r->dado){
			r->esq = inserir(valor,r->esq);
		} else {
			r->dir = inserir(valor,r->dir);
		}
		
		r->fb = altura(r->esq) - altura(r->dir);
		
		if (r->fb == -2) { //Rotação para a esquerda
			if (r->dir->fb < 0) { //Simples
				r = rodarEsq(r);
			} else if (r->dir->fb > 0) { //Dupla
				r->dir = rodarDir(r->dir);
				r = rodarEsq(r);
			}
		} else if (r->fb == 2) { //Rotação para a direita
			if (r->esq->fb > 0)	{ //Simples
				r = rodarDir(r);
			} else if (r->esq->fb < 0) { //Dupla
				r->esq = rodarEsq(r->esq);
				r = rodarDir(r);
			}
		}
		atualizarFB(r);
		return r;
	} else {
		Arvore *novo = (Arvore *)malloc(sizeof(Arvore));
		novo->dado = valor;
		novo->fb = 0;
		novo->esq = NULL;
		novo->dir = NULL;
		return novo;
	}
}

void exibir(Arvore *r, int espaco) {
    int i;
    
    if (r == NULL) {
    	return; 
	}

    espaco += count; 
  
    exibir(r->dir, espaco); 
    printf("\n"); 
    for (i = count; i < espaco; i++) {
        printf(" "); 
	}
    printf("%d(%d)\n", r->dado, r->fb);
    exibir(r->esq, espaco); 
}

void atualizarFB(Arvore *r) {
	if (r) {
		r->fb = altura(r->esq) - altura(r->dir);
		atualizarFB(r->esq);
		atualizarFB(r->dir);
	}
}

int main() {
	setlocale(LC_ALL, "Portuguese");
	
	Arvore *raiz = NULL;
	int opcao;
	
	do {
		printf("=== Tarefa sobre Árvores AVL\n\nSelecione uma opção abaixo:\n\n1 - Inserir aleatoriamente\n2 - Inserir manualmente\n3 - Exibir última árvore gerada\n4 - Sair\n\nOpção: ");
		scanf("%d", &opcao);
		
		switch (opcao) {
			case 1: {
				system("cls");
				int qtdNumeros = 0, range = 0, i;

				printf ("Insira a quantidade e o range dos números a serem gerados:\n\nQuantidade: ");
				scanf("%d", &qtdNumeros);
				printf ("Range: ");
				scanf("%d", &range);
				
				raiz = NULL;
				srand(time(NULL));
				for (i = 0; i < qtdNumeros; i++) {
					raiz = inserir(rand() % range, raiz);
				}
				system("cls");
				break;
			}
			case 2: {
				system("cls");
				int qtdNumeros = 0, num = 0, i;
				
				printf ("Insira a quantidade de números para inserir:\n\nQuantidade: ");
				scanf("%d", &qtdNumeros);
				printf("\n");
				
				raiz = NULL;
				for (i = 0; i < qtdNumeros; i++) {
					printf("%dº número: ", i + 1);
					scanf("%d", &num);
					raiz = inserir(num, raiz);
				}
				system("cls");
				break;
			}
			case 3: {
				system("cls");
				
				exibir(raiz, 0);
				printf("\n");
				
				system("pause");
				system("cls");	
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

	return 1;
}
