package trabalhoOO;

import java.util.Scanner;
public class SistemaOO {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int o;
		int quant;
		int l=0;
		int k=0;
		int esc7;
		int j=0;
		int i ;
		int escolha;
		int qt ;
		int qtP;
		int m;
		String busca;
		String nome[]=new String[100];
		String endereco[]= new String[100];
		int telefone[] = new int [100];
		int esc2;
		char esc;
		char esc6;
		String novonome;
		String novoend;
		int novotel;
		String nomeP[]=new String[100];
		float valorP[]=new float[100];
		String porcP[]=new String[100];
		String descP[]=new String [100];
		int quantP[]= new int[100];
		String busca2;
		char esc3;
		int esc4;
		String novonomeP;
		float novovalor;
		String novopor;
		String novodesc;
		int novoquant;
		String venda;
		String procura;
		int total[]=new int[100];
		int menos[]=new int[100];
		
		System.out.println("Segue a lista de clientes e produtos");
		for(i=0;i<10;i++) {

			//clientes
			nome[l]="cliente"+l;

			System.out.println(nome[l]);
			System.out.println("-----------------------------------");
			endereco[l]="Bairro Joabna"+l;
			telefone[l]=99999976+l;
			
			
			//produtos
			nomeP[l]="Produto"+l;
			System.out.println(nomeP[l]);
			System.out.println("-----------------------------------");
			 valorP[l]=10+l;
			 porcP[l]=l+"%";
			 descP[l]="descrição"+l;
			 quantP[l]=100+l;
			l++;
			
			
		}
		o=l;
		m=l;
		quant=l;
		//MENU
		do {
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("1.Cadastro de novo cliente ");
		System.out.println("2. Busca por cliente ");
		System.out.println("3. Cadastro de novo produto ");
		System.out.println("4. Busca por produto ");
		System.out.println("5. Cadastro de venda.  ");
		System.out.println("6. Mostrar produtos em estoque. ");
		System.out.println("7. Sair ");
		escolha=ler.nextInt();
		//INICIO DA FUNÇÃO DE CADASTRO DOS CLIENTES
		if(escolha==1) {
		
		
			System.out.println("Digite o quantos clientes a serem cadastrados ");
			qt=ler.nextInt();
			
			
			
			
			for(i=m;i<m+qt;i++) {
			
				
				System.out.println("Digite o nome do cliente:");
				ler.nextLine();
				nome[i]=ler.nextLine();
				System.out.println("Digite o endereço do cliente: ");
				endereco[i]=ler.nextLine();
				System.out.println("Digite o telefone do cliente:(9 digitos) ");
				telefone[i]=ler.nextInt();
				j++;
			}	
			
			
			m=j;
			
			System.out.println("Cadastro feito!");
			
		
		}//FIM DA FUNÇÃO DE CADASTRO DE CLIENTES
		//INICIO DA FUNÇÃO DE BUSCA DE CLIENTES	
		if(escolha==2) {
			
		
			System.out.println("Digite o nome do cliente a ser procurado:");
			ler.nextLine();
			busca=ler.nextLine();
			for(i=0;i<m+quant;i++) {
			if(nome[i].equals(busca)){

				System.out.println("Se deseja alterar alguma informação tecle 's',caso deseje voltar para o menu tecle qualquer tecla. " );	
				System.out.println("Nome: "+nome[i]);
				System.out.println("Endereço: "+endereco[i]);
				System.out.println("Telefone: "+telefone[i]);
				esc=ler.next().charAt(0);
				
					if(esc=='s') {
						
						System.out.println("Qual informacao deseja alterar?");
						System.out.println("1.Nome");
						System.out.println("2.Endereço");
						System.out.println("3.Telefone");
						esc2=ler.nextInt();
						
							switch(esc2) {
							
							case 1:
								System.out.println("Digite o nome novo");
								ler.nextLine();
								novonome=ler.nextLine();
								
								nome[i]=novonome;
								break;
								
							case 2:
								System.out.println("Digite o endereço novo");
								ler.nextLine();
								novoend=ler.nextLine();
								
								endereco[i]=novoend;	
								break;
								
							case 3:
								System.out.println("Digite o telefone novo");
								novotel=ler.nextInt();
								
								telefone[i]=novotel;
								break;
							default:
								System.out.println("Não existe essa opção");	
							}	
							
							
						
					}
					
			}
			
			}
		}//FIM DA FUNÇÃO DE BUSCA DE CLIENTES
			
		//INICIO DA FUNÇÃO DE CADASTRO DE PRODUTOS
		if(escolha==3) {
			
		
			System.out.println("Digite a quantidade de produtos que  deseja cadastrar? ");
			qtP=ler.nextInt();
		
			
for(i=o;i<o+qtP;i++) {
			
				
				System.out.println("Digite o nome do produto:");
				nomeP[i]=ler.next();
				System.out.println("Digite a descrição do produto: ");
				descP[i]=ler.next();
				System.out.println("Digite o valor do produto: ");
				valorP[i]=ler.nextFloat();
				System.out.println("Digite a porcentagem de lucro do produto: ");
				porcP[i]=ler.next();
				System.out.println("Digite a quantidade de estoque produto: ");
				quantP[i]=ler.nextInt();
				total[i]=quantP[i];
				k++;
				
			}
o=k;
System.out.println("Cadastro realizado ");
		}//FIM DA FUNÇÃO DE CADASTRO DE PRODUTOS
		
		//INICION DA FUNÇÃO DE BUSCA DE PRODUTOS
		if(escolha==4) {
			
		
			System.out.println("Digite o nome do produto a ser procurado:");
			busca2=ler.next();
			for(i=0;i<m+quant;i++) {
			if(nomeP[i].equals(busca2)){
				System.out.println("Nome: "+nomeP[i]);
				System.out.println("Descrição: "+descP[i]);
				System.out.println("Valor: "+valorP[i]);
				System.out.println("Porcentagem de lucro: "+porcP[i]);
				System.out.println("Quantidade: "+quantP[i]);
				
				System.out.println("Se deseja alterar alguma informação tecle 's',caso deseje voltar para o menu tecle qualquer tecla. " );	
				esc3=ler.next().charAt(0);
				
					if(esc3=='s') {
						
						System.out.println("Qual informacao deseja alterar?");
						System.out.println("1.Nome");
						System.out.println("2.Descrição");
						System.out.println("3.valor");
						System.out.println("4.Porcentagem de lucro");
						System.out.println("5.Quantidade no estoque");
						esc4=ler.nextInt();
						
							switch(esc4) {
							
							case 1:
								System.out.println("Digite o nome novo");
								ler.nextLine();
								novonomeP=ler.nextLine();
								
								nomeP[i]=novonomeP;
								break;
								
							case 2:
								System.out.println("Digite a descrição nova");
								ler.nextLine();
								novodesc=ler.nextLine();
								
								descP[i]=novodesc;	
								break;
								
							case 3:
								System.out.println("Digite o valor novo");
								novovalor=ler.nextFloat();
								
								valorP[i]=novovalor;
								break;
								
							case 4:
								System.out.println("Digite a porcentagem de lucro novo");
								ler.nextLine();
								novopor=ler.nextLine();
								
								porcP[i]=novopor;
								break;
							case 5:
								System.out.println("Digite a quantidade de estoque novo");
								novoquant=ler.nextInt();
								
								quantP[i]=novoquant;
								break;	
							default:
								System.out.println("Não existe essa opção");
								
							}	
							
							
						
					}
				
			}
			}
		}//FIM DA FUNÇÃO DE BUSCA DOS PRODUTOS
		
		//INICIO DA FUNÇÃO DO CADASTRO DE VENDAS
		if(escolha==5) {
			
		
			System.out.println("Segue a lista de clientes cadastrados. Para selecionar um digite  nome do cliente desejado");
			for(i=0;i<m+quant;i++) {
	
				System.out.println(nome[i]);
				
				
			}
			ler.nextLine();
			venda=ler.nextLine();
			
		for(i=0;i<m+quant;i++) {
			if(nome[i].equals(venda)) {
				
					
				do {
					
				
				System.out.println("Segue a lista de produtos cadastrados.Para selecionar digite o nome do produto desejado");
				for(i=m;i<o+quant;i++) {
					System.out.println(nomeP[i]);
					
				}
				procura=ler.next();
				for(i=m;i<o+quant;i++) {
				if(nomeP[i].equals(procura)) {
					System.out.println("Quantos produtos deseja obter?");
					menos[i]=ler.nextInt();
				
					quantP[i]=quantP[i]-menos[i];
					
					if(quantP[i]<0){
						System.out.println("Estoque insuficente para a a quantidade solicitada");
						quantP[i]=total[i];
						
						
					}
					
						
				}	
				
								}
				System.out.println("Caso deseje fazer novas vendas tecle 's',se seu desejo é sair tecle qualquer outra tecla");
				esc6=ler.next().charAt(0);
				}while(esc6=='s');
			}
			
			}
		}//FIM DA FUNÇÃO DE CADASTRO DE VENDAS
		
		//INICIO DA FUNÇÃO DE MOSTRAR A QUANTIDADE DE PRODUTOS
		if(escolha==6) {
			
		
			
				
			
			for(i=0;i<m+quant;i++) {
				System.out.println("---------------------------------");
				System.out.println(nomeP[i]+"--"+quantP[i]);
				total[i]=quantP[i];
				
				
			}
			do {
			System.out.println("Para sair tecle 's'");
			esc7=ler.next().charAt(0);
			}while(esc7!='s');
		}//FIM DA FUNÇÃO DE MOSTRAR A QUANTIDADE DE PRODUTOS
		
		//INICIO DA FUNÇÃO DE ENCERRAMENTO DO PROGAMA
		if(escolha==7) {
			
		
		System.out.println("Progama encerrado!");
		}//FIM DA FUNÇÃO DE ENCERRAMENTO DO PROGAMA
		
		
		
		}while(escolha!=7);	
		
			
		}

}
